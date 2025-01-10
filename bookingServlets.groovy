public package com.transport.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class BookingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display the booking form (booking.jsp)
        request.getRequestDispatcher("/booking.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle the booking form submission
        String vehicleId = request.getParameter("vehicleId");
        String customerName = request.getParameter("customerName");
        String destination = request.getParameter("destination");
        
        // In a real application, you would store this data in a database.
        // For this example, we just simulate a successful booking.
        
        // Example: Storing booking information in session
        HttpSession session = request.getSession();
        session.setAttribute("bookingDetails", "Vehicle ID: " + vehicleId + ", Customer: " + customerName + ", Destination: " + destination);

        // Redirect to a confirmation page
        response.sendRedirect("bookingConfirmation.jsp");
    }
}
