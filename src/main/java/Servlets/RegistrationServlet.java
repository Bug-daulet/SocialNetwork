package Servlets;

import Classes.User;
import DB.DBQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            String err = DBQueries.addUser(username, password);
            if (err != "") {
                request.setAttribute("error", err);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "Registered successfully!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
