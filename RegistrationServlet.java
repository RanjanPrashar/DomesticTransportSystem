package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the request to registration.jsp to display the form
        request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");

        // Simulate saving the user to a database
        // Here, we simply store it in the session for simplicity
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("fullName", fullName);
        session.setAttribute("email", email);

        // Redirect to the profile page after successful registration
        response.sendRedirect("profile");
    }
}
