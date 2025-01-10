package review3.java;

public package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display the admin dashboard (admin_dashboard.jsp)
        request.getRequestDispatcher("/admin_dashboard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the admin action and parameters from the form
        String action = request.getParameter("action");
        String vehicleId = request.getParameter("vehicleId");

        // Simulate handling the admin actions (in a real app, this would interact with a database)
        if ("addVehicle".equals(action)) {
            // Add vehicle logic (e.g., save to database)
            // Here we simulate adding the vehicle.
            // In a real implementation, you'd probably interact with a database like this:
            // vehicleService.addVehicle(vehicleId);
            response.getWriter().println("Vehicle with ID " + vehicleId + " added successfully!");
        } else if ("removeVehicle".equals(action)) {
            // Remove vehicle logic (e.g., remove from database)
            // vehicleService.removeVehicle(vehicleId);
            response.getWriter().println("Vehicle with ID " + vehicleId + " removed successfully!");
        } else {
            response.getWriter().println("Invalid action!");
        }
    }
}
 
