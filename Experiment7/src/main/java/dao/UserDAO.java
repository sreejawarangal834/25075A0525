package dao;

import java.sql.*;
import model.User;
import util.DBConnection;

public class UserDAO {

    public boolean register(User user) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
            con.prepareStatement("INSERT INTO SYSTEM.users VALUES (?, ?)");

        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());

        return ps.executeUpdate() > 0;
    }

    public boolean login(User user) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM SYSTEM.users WHERE username=? AND password=?");

        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
}