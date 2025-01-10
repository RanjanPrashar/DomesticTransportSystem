package com.transport.dao.impl;

import com.transport.dao.BookingDAO;
import com.transport.model.Booking;
import java.util.List;
import java.util.ArrayList;

public class BookingDAOImpl implements BookingDAO {

    private List<Booking> bookings = new ArrayList<>();  // Simulating database with an in-memory list

    @Override
    public Booking getBookingById(int bookingId) {
        return bookings.stream().filter(b -> b.getBookingId() == bookingId).findFirst().orElse(null);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookings;
    }

    @Override
    public void saveBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public void deleteBooking(int bookingId) {
        bookings.removeIf(b -> b.getBookingId() == bookingId);
    }
}
