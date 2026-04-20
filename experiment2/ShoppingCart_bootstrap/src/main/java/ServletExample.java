 

import java.io.PrintWriter;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegServlet
 */
//@WebServlet("/RegServlet")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletExample() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String url="jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1";
		String user="system";
		String password="system123";
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement("insert into students(name,email) values(?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			int i=ps.executeUpdate();
			System.out.println(i);
			if(i>0) {
				out.println("Data inserted succesfully");
				
			}
			else {
				out.println("Insertion failed");
			}
			ps.close();
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		doGet(request, response);
	}

}