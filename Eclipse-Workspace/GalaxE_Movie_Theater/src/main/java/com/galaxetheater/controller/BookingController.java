package com.galaxetheater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxetheater.modal.Booking;
import com.galaxetheater.service.BookingService;

@RestController
@RequestMapping("booking")
@CrossOrigin(origins = "*")
public class BookingController {

	@Autowired
	BookingService bookingService;

	@Autowired
	Booking booking;

	@GetMapping("GET")
	public ResponseEntity<List<Booking>> GET() {
		List<Booking> booking = bookingService.getAllTickets();
		ResponseEntity<List<Booking>> responseEntity;
		if (booking.isEmpty()) {
			responseEntity = new ResponseEntity<List<Booking>>(booking, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Booking>>(booking, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PostMapping("POST")
	public ResponseEntity<String> POST(@RequestBody Booking booking) {
		ResponseEntity<String> responseEntity;
		int bId = booking.getId();
		if (bookingService.isBookingExists(bId)) {
			responseEntity = new ResponseEntity<String>("Booking With ID: " + bId + " Already Exists",
					HttpStatus.CONFLICT);
		} else {
			String message = bookingService.saveTicket(booking);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping("PUT")
	public ResponseEntity<String> PUT(@RequestBody Booking booking) {
		ResponseEntity<String> responseEntity;
		int bId = booking.getId();
		if (!bookingService.isBookingExists(bId)) {
			responseEntity = new ResponseEntity<String>("Booking With ID: " + bId + " Doesn't Exist",
					HttpStatus.NOT_FOUND);
		} else {
			String message = bookingService.editTicket(booking);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@DeleteMapping("DELETE/{id}")
	public ResponseEntity<String> DELETE(@PathVariable("id") Integer id) {
		ResponseEntity<String> responseEntity;
		if (bookingService.isBookingExists(id)) {
			String message = bookingService.deleteTicket(id);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {
			String errorMessage = "No Such Booking ID Exists";
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@GetMapping("GET/{id}")
	public ResponseEntity<Booking> GET(@PathVariable("id") Integer id) {
		ResponseEntity<Booking> responseEntity;
		if (bookingService.isBookingExists(id)) {
			booking = bookingService.getBookingById(id);
			responseEntity = new ResponseEntity<Booking>(booking, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Booking>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	public BookingController() {
		// TODO Auto-generated constructor stub
	}

}
