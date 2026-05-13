package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.UserDAO;
import model.User;

@WebServlet("/controller")
public class MainController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");

        String action = req.getParameter("action");

        try {

            // 🔹 REGISTER
            if ("register".equals(action)) {

                User user = new User();
                user.setUsername(req.getParameter("username"));
                user.setPassword(req.getParameter("password"));

                UserDAO dao = new UserDAO();

                if (dao.register(user)) {
                    res.getWriter().println("<h3>Registration Successful!</h3>");
                    res.getWriter().println("<a href='login.html'>Login Now</a>");
                } else {
                    res.getWriter().println("Registration Failed");
                }
            }

            // 🔹 LOGIN
            else if ("login".equals(action)) {

                User user = new User();
                user.setUsername(req.getParameter("username"));
                user.setPassword(req.getParameter("password"));

                UserDAO dao = new UserDAO();

                if (dao.login(user)) {

                    HttpSession session = req.getSession();
                    session.setAttribute("user", user.getUsername());

                    res.sendRedirect("catalog.html");

                } else {
                    res.getWriter().println("<h3>Invalid Login</h3>");
                    res.getWriter().println("<a href='login.html'>Try Again</a>");
                }
            }

            // 🔹 ADD TO CART
            else if ("addToCart".equals(action)) {

                String product = req.getParameter("product");

                HttpSession session = req.getSession();

                // Get existing cart
                List<String> cart = (List<String>) session.getAttribute("cart");

                if (cart == null) {
                    cart = new ArrayList<>();
                }

                cart.add(product);
                session.setAttribute("cart", cart);

                res.getWriter().println("<h3>Added to cart: " + product + "</h3>");
                res.getWriter().println("<a href='catalog.html'>Continue Shopping</a><br>");
                res.getWriter().println("<a href='cart.html'>View Cart</a>");
            }

            // 🔹 VIEW CART
            else if ("viewCart".equals(action)) {

                HttpSession session = req.getSession();

                List<String> cart = (List<String>) session.getAttribute("cart");

                res.getWriter().println("<h2>Your Cart</h2>");

                if (cart != null && !cart.isEmpty()) {

                    for (String item : cart) {
                        res.getWriter().println("<p>" + item + "</p>");
                    }

                } else {
                    res.getWriter().println("<p>Cart is empty</p>");
                }

                res.getWriter().println("<br><a href='catalog.html'>Back to Catalog</a>");
            }

            // 🔹 CHECKOUT
            else if ("checkout".equals(action)) {

                HttpSession session = req.getSession();

                session.removeAttribute("cart");

                res.getWriter().println("<h3>Checkout Successful!</h3>");
                res.getWriter().println("<a href='catalog.html'>Shop Again</a>");
            }

            // 🔹 LOGOUT (optional but good)
            else if ("logout".equals(action)) {

                HttpSession session = req.getSession(false);

                if (session != null) {
                    session.invalidate();
                }

                res.getWriter().println("<h3>Logged out successfully</h3>");
                res.getWriter().println("<a href='login.html'>Login Again</a>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            res.getWriter().println("Error occurred: " + e.getMessage());
        }
    }
}