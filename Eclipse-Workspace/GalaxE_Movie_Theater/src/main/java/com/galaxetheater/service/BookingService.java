package com.galaxetheater.service;

import java.util.List;

import com.galaxetheater.modal.Booking;

public interface BookingService {
	public List<Booking> getAllTickets();

	public String saveTicket(Booking booking);

	public String editTicket(Booking booking);

	public String deleteTicket(int id);

	public Booking getBookingById(int bookingId);

	public boolean isBookingExists(Integer bookingId);


}
