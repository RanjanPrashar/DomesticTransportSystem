package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class BookingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Render booking page or fetch booking data
        request.getRequestDispatcher("/booking.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle booking logic (data submission)
        String vehicleId = request.getParameter("vehicleId");
        String customerName = request.getParameter("customerName");
        String destination = request.getParameter("destination");
        // Store the booking information in the database (not implemented here)
        
        // For demonstration, send a success message
        response.getWriter().println("Booking successful for vehicle " + vehicleId + " to " + destination);
    }
}
