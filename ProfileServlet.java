public package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get user information from session
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String fullName = (String) session.getAttribute("fullName");
        String email = (String) session.getAttribute("email");
        
        if (username == null) {
            // If no user is logged in, redirect to login or registration page
            response.sendRedirect("registration");
            return;
        }
        
        // Set user data as attributes to display in the profile page
        request.setAttribute("username", username);
        request.setAttribute("fullName", fullName);
        request.setAttribute("email", email);
        
        // Forward to the profile page
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle profile updates
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");

        // Update session data with new profile information
        HttpSession session = request.getSession();
        session.setAttribute("fullName", fullName);
        session.setAttribute("email", email);
        
        // Redirect to the profile page to reflect the updated information
        response.sendRedirect("profile");
    }
}

