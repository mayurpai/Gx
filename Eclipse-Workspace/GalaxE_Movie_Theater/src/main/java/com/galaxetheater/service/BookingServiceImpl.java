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
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Booking> getAllTickets() {
		return (List<Booking>) bookingDAO.findAll();
	}

	@Override
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
	public String editTicket(Booking booking) {
		bookingDAO.save(booking);
		return "Ticekt Successfully Updated!";
	}

	@Override
	public String deleteTicket(int id) {
//		seatDAO.deleteBookingBySeatFk(id);
//		ticketDAO.deleteBookingByBookingFk(id);
//		bookingDAO.deleteById(id);
		return "Ticket Successsfully Deleted!";
	}

	@Override
	public Booking getBookingById(int bookingId) {
		Optional<Booking> booking = bookingDAO.findById(bookingId);
		return booking.get();
	}

	@Override
	public boolean isBookingExists(Integer bookingId) {
		Optional<Booking> booking = bookingDAO.findById(bookingId);
		return booking.isPresent();
	}

}
