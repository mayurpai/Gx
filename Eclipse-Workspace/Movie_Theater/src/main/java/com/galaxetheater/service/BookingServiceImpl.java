package com.galaxetheater.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxetheater.dao.BookingDAO;
import com.galaxetheater.dao.SeatDAO;
import com.galaxetheater.dao.TicketDAO;
import com.galaxetheater.enums.SeatBooking;
import com.galaxetheater.modal.Booking;
import com.galaxetheater.modal.Seat;
import com.galaxetheater.modal.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	SeatDAO seatDAO;

	@Autowired
	BookingDAO bookingDAO;

	@Autowired
	TicketDAO ticketDAO;

	@Autowired
	Booking booking;

	@Autowired
	Ticket ticket;

	public BookingServiceImpl() {
	}

	@Override
	// Get All Booking Details
	public List<Booking> getAllTickets() {
		return (List<Booking>) bookingDAO.findAll();
	}

	@Override
	// Post Booking Detail
	public String saveTicket(Booking booking) {
		bookingDAO.save(booking);
		Ticket ticket = new Ticket();
		ticket.setCode(booking.getCode());
		ticket.setName(booking.getName());
		ticket.setBookingDetails(booking);
		ticketDAO.save(ticket);
		return "Ticket Saved Successfully";
	}

	@Override
	// Update Booking Detail
	public String editTicket(Booking booking) {
		bookingDAO.save(booking);
		return "Ticket Successfully Updated!";
	}

	@Override
	// Delete Booking Detail
	public String deleteTicket(int id) {
		return "Ticket Successsfully Deleted!";
	}

	@Override
	// Get Booking Detail By ID
	public Booking getBookingById(int bookingId) {
		Optional<Booking> booking = bookingDAO.findById(bookingId);
		return booking.get();
	}

	@Override
	// Check If Booking ID Exists
	public boolean isBookingExists(Integer bookingId) {
		Optional<Booking> booking = bookingDAO.findById(bookingId);
		return booking.isPresent();
	}

}
