package com.galaxetheater.controller;

//util imports

import java.util.List;

//springframework imports

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

//project imports

import com.galaxetheater.modal.Booking;
import com.galaxetheater.service.BookingService;

@RestController
@RequestMapping("booking")
@CrossOrigin(origins = "*")

//Controller --> ServiceImpl [Service]

public class BookingController {

	@Autowired
	BookingService bookingService;

	@Autowired
	Booking booking;

	/*
	 * |--------API to Fetch All Booking Data--------| Call : GET :
	 * "http://localhost:9091/booking/GET"
	 */

	@GetMapping("GET")
	public ResponseEntity<List<Booking>> GET() {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try fetching all booking from
		 * Service Implementation 3. if Successful send proper response with response
		 * code 3. Catch and send proper Response Code
		 */

		List<Booking> booking = bookingService.getAllTickets();
		ResponseEntity<List<Booking>> responseEntity;
		if (booking.isEmpty()) {
			responseEntity = new ResponseEntity<List<Booking>>(booking, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Booking>>(booking, HttpStatus.OK);
		}
		return responseEntity;
	}

	/*
	 * |--------API to post Booking Data into Database--------| Call : POST :
	 * "http://localhost:9091/booking/POST"
	 */

	@PostMapping("POST")
	public ResponseEntity<String> POST(@RequestBody Booking booking) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try saving booking through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

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

	/*
	 * |--------API to update Booking Data into Database--------| Call : PUT :
	 * "http://localhost:9091/booking/PUT"
	 */

	@PutMapping("PUT")
	public ResponseEntity<String> PUT(@RequestBody Booking booking) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try updating bookings through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

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

	/*
	 * |--------API to delete Booking Data from Database--------| Call : DELETE :
	 * "http://localhost:9091/booking/DELETE/{id}"
	 */

	@DeleteMapping("DELETE/{id}")
	public ResponseEntity<String> DELETE(@PathVariable("id") Integer id) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try deleting bookings through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

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

	/*
	 * |--------API to find booking by id--------| Call : PUT :
	 * "http://localhost:9091/booking/GET/{id}"
	 */

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
