package com.galaxetheater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
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

import com.galaxetheater.modal.Seat;
import com.galaxetheater.service.SeatServiceImpl;
import com.theater.dto.SeatDTO;

@RestController
@RequestMapping("seat")
@CrossOrigin(origins = "*")
public class SeatController {

	@Autowired
	SeatServiceImpl seatServiceImpl;

	@PostMapping("saveSeat")
	public ResponseEntity<String> saveSeats(@RequestBody Seat seat) {
		ResponseEntity<String> responseEntity;
		int seatId = seat.getId();
		if (seatServiceImpl.isSeatExists(seatId)) {
			responseEntity = new ResponseEntity<String>("already exists" + seatId, HttpStatus.CONFLICT);
		} else {
			seatServiceImpl.saveSeat(seat);
			responseEntity = new ResponseEntity<String>("saved succesfully", HttpStatus.OK);
		}

		return responseEntity;

	}

	@GetMapping
	public ResponseEntity<List<Seat>> getAllSeats() {
		ResponseEntity<List<Seat>> responseEntity;
		List<Seat> seatId = seatServiceImpl.getAllSeats();
		if (seatId.isEmpty()) {
			responseEntity = new ResponseEntity<List<Seat>>(seatId, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Seat>>(seatId, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping("updateSeat")
	public ResponseEntity<String> editSeats(@RequestBody Seat seat) {
		ResponseEntity<String> responseEntity;
		int seatId = seat.getId();
		if (!seatServiceImpl.isSeatExists(seatId)) {
			responseEntity = new ResponseEntity<String>("Seat is not exists" + seatId, HttpStatus.NO_CONTENT);
		} else {
			seatServiceImpl.editSeats(seat);
			responseEntity = new ResponseEntity<String>("Updated successfully" + seatId, HttpStatus.OK);
		}

		return responseEntity;

	}

	@DeleteMapping("deleteSeat/{seatId}")
	public ResponseEntity<String> deleteSeats(@PathVariable int seatId) {
		ResponseEntity<String> responseEntity;

		if (seatServiceImpl.isSeatExists(seatId)) {
			String seat = seatServiceImpl.deleteSeat(seatId);
			responseEntity = new ResponseEntity<String>("deleted successfully" + seat, HttpStatus.OK);

		} else {
			responseEntity = new ResponseEntity<String>("Seat does not exists", HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

}
