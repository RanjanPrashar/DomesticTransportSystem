package com.transport.service;

import com.transport.dao.BookingDAO;
import com.transport.dao.impl.BookingDAOImpl;
import com.transport.model.Booking;
import java.util.List;

public class BookingService {

    private BookingDAO bookingDAO = new BookingDAOImpl();

    public void addBooking(Booking booking) {
        bookingDAO.saveBooking(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }

    public Booking getBookingById(int bookingId) {
        return bookingDAO.getBookingById(bookingId);
    }

    public void removeBooking(int bookingId) {
        bookingDAO.deleteBooking(bookingId);
    }
}
