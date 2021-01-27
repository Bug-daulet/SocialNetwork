package DB;

import Classes.User;

import java.sql.*;
import java.util.ArrayList;

public class DBQueries {
    private static ArrayList<User> userList = new ArrayList<>();

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        DBQueries.userList = userList;
    }

    public static String addUser(String username, String password) throws SQLException {
        int id = addDBUser(username, password);
        if (id == 0) {
            return "Something went wrong!";
        }
        User user = new User(id, username, password);
        userList.add(user);
        return "";
    }

    private static int addDBUser(String username, String password) throws SQLException {
        Connection connection = DBCon.getInstance().getConnection();
        PreparedStatement pstmt;
        pstmt = connection.prepareStatement("INSERT INTO USERS(username, password) VALUES (?, ?) RETURNING id");
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        int id = 0;
        if (rs.next()) {
            id = rs.getInt(1);
        }
        rs.close();
        pstmt.close();
        connection.close();
        return id;
    }
}
