public package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display Admin Dashboard
        request.getRequestDispatcher("/admin_dashboard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle admin actions (add/remove vehicles, routes, etc.)
        String action = request.getParameter("action");
        if ("addVehicle".equals(action)) {
            String vehicleId = request.getParameter("vehicleId");
            // Add vehicle logic here (not implemented)
            response.getWriter().println("Vehicle " + vehicleId + " added successfully!");
        }
        // Handle other actions like removing vehicles or routes
    }
}

