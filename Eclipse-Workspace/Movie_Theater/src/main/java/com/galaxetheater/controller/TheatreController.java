package com.galaxetheater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theater.dto.RowDto;
import com.galaxetheater.modal.*;
import com.galaxetheater.service.TheatreService;

@RestController
@RequestMapping("theatre")
@CrossOrigin
public class TheatreController {

	@Autowired
	TheatreService theatreService;
	
	@GetMapping
	public ResponseEntity<List<Theater>> getTheater() {
		List<Theater> theater= theatreService.getTheater();
		ResponseEntity<List<Theater>> responseEntity;
		if (theater.isEmpty()) {
			responseEntity = new ResponseEntity<List<Theater>>(theater, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Theater>>(theater, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<String> saveTheatre(@RequestBody Theater theatre) {
		ResponseEntity<String> responseEntity;
		int id = theatre.getId();
		if (theatreService.isIdExists(id)) {
			responseEntity = new ResponseEntity<String>("User already exists", HttpStatus.CONFLICT);
		} else {
			String message = theatreService.saveTheatre(theatre);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);

		}
		return responseEntity;
	}

	@PostMapping("save")
	public ResponseEntity<String> saveAddress(@RequestBody Address address) {
		ResponseEntity<String> responseEntity;
		int id = address.getId();
		if (theatreService.isIdExists(id)) {
			responseEntity = new ResponseEntity<String>("User already exists", HttpStatus.CONFLICT);
		} else {
			String message = theatreService.saveAddress(address);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PostMapping("save/row")
	public void saveRow(@RequestBody RowDto rowDto) {
		theatreService.saveRow(rowDto);
		return;
	}

}
