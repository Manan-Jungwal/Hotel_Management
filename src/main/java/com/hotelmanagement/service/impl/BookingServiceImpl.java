package com.hotelmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.entity.Booking;
import com.hotelmanagement.repository.BookingRepository;
import com.hotelmanagement.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository repo;

    public Booking createBooking(Booking booking) {
        return repo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return repo.findAll();
    }

    public Booking getBookingById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Booking updateBooking(Long id, Booking booking) {
        booking.setBookingId(id);
        return repo.save(booking);
    }

    public void cancelBooking(Long id) {
        repo.deleteById(id);
    }
}