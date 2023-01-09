package com.galaxetheater.controller;

//util imports

import java.util.ArrayList;
import java.util.List;

//springframework imports

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.exceptions.MovieNotFound;
import com.galaxetheater.modal.Movie;
import com.galaxetheater.service.MovieService;
import com.galaxetheater.service.MovieServiceImpl;

import org.apache.logging.log4j.*;

@RestController
@RequestMapping("/movie")
@CrossOrigin

//Controller --> ServiceImpl [Service]

public class MovieController {
	@Autowired
	MovieService movieServiceImpl;

	private static Logger LOGGER = LogManager.getLogger(BookingController.class.getName());

	/*
	 * |--------API to Fetch Movie Data By Name--------| Call : GET :
	 * "http://localhost:9091/movie/movieName/{name}"
	 */

	@GetMapping("/movieName/{name}")
	public ResponseEntity<?> movieName(@PathVariable("name") String name) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try find movie by name
		 * through Service Implementation 3. if Successful send proper response with
		 * response code 4. Catch and send proper Response Code
		 */

		ResponseEntity<?> responseEntity = null;
		Movie movieList = null;
		try {
			movieList = movieServiceImpl.findByName(name);
			responseEntity = new ResponseEntity<Movie>(movieList, HttpStatus.OK);
		} catch (MovieNotFound e) {
			responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.IM_USED);
			LOGGER.error("ERROR 404");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}

	/*
	 * |--------API to post Movie Data into Database--------| Call : POST :
	 * "http://localhost:9091/movie/saveMovie"
	 */

	@PostMapping("/saveMovie")
	public ResponseEntity<String> saveMovie(@RequestBody Movie movie) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try saving movie through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

		ResponseEntity<String> responseEntity;
		String moviesAll = movie.getCode();
		if (movieServiceImpl.isMovieExists(moviesAll)) {
			responseEntity = new ResponseEntity<String>("already exists" + moviesAll, HttpStatus.CONFLICT);
		} else {
			movieServiceImpl.saveMovies(movie);
			responseEntity = new ResponseEntity<String>("saved successfully" + moviesAll, HttpStatus.OK);
		}
		return responseEntity;

	}

	/*
	 * |--------API to get all Booking Data from Database--------| Call : GET :
	 * "http://localhost:9091/booking/"
	 */

	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies() {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try getting movie through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

		ResponseEntity<List<Movie>> responseEntity;
		List<Movie> movieList = movieServiceImpl.getAllMovies();
		if (movieList.isEmpty()) {
			responseEntity = new ResponseEntity<List<Movie>>(movieList, HttpStatus.NO_CONTENT);

		} else {
			responseEntity = new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
		}
		return responseEntity;
	}

	/*
	 * |--------API to Fetch Movie Data By Movie Status--------| Call : GET :
	 * "http://localhost:9091/movie/movieStatus"
	 */

	@GetMapping("movieStatus")
	public List<Movie> movieStatus() {
		List<Movie> movieStatus = movieServiceImpl.findByMovieStatus(MovieStatus.RUNNING);
		return movieStatus;
	}

	/*
	 * |--------API to get all Movie Data from Database by date--------| Call : GET
	 * : "http://localhost:9091/movie/date/{moviedate}"
	 */

	@GetMapping("date/{moviedate}")
	public ResponseEntity<?> getMovieByDate(@PathVariable("moviedate") String releaseDate) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try getting movie through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

		ResponseEntity<?> responseEntity;
		List<Movie> movieDate = new ArrayList<>();
		try {
			movieDate = movieServiceImpl.findByReleaseDate(releaseDate);
			responseEntity = new ResponseEntity<List<Movie>>(movieDate, HttpStatus.OK);
		} catch (MovieNotFound e) {
			// TODO Auto-generated catch block
			responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.IM_USED);
			LOGGER.error("ERROR 404");
			e.printStackTrace();
		}
		return responseEntity;
	}

	/*
	 * |--------API to update Movie Data into Database--------| Call : PUT :
	 * "http://localhost:9091/movie/updateMovie"
	 */

	@PutMapping("updateMovie")
	public ResponseEntity<String> updateMovie(@RequestBody Movie movie) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try update movie through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

		ResponseEntity<String> responseEntity;
		String moviesAll = movie.getCode();
		if (!movieServiceImpl.isMovieExists(moviesAll)) {
			responseEntity = new ResponseEntity<String>("already exists" + moviesAll, HttpStatus.CONFLICT);
		} else {
			movieServiceImpl.saveMovies(movie);
			responseEntity = new ResponseEntity<String>("updated successfully" + moviesAll, HttpStatus.OK);
		}
		return responseEntity;
	}

	/*
	 * |--------API to delete Movie Data from Database by id--------| Call : DELETE
	 * : "http://localhost:9091/movei/deleteMovie/{id}"
	 */

	@DeleteMapping("deleteMovie/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable("id") String code) {

		/*
		 * Pseudo Code 1. Create Response Entity Object 2. Try delete movie through
		 * Service Implementation 3. if Successful send proper response with response
		 * code 4. Catch and send proper Response Code
		 */

		ResponseEntity<String> responseEntity;
		if (!movieServiceImpl.isMovieExists(code)) {
			responseEntity = new ResponseEntity<String>("Movie does not exists", HttpStatus.CONFLICT);
		} else {
			String movie = movieServiceImpl.deleteMovies(code);
			responseEntity = new ResponseEntity<String>("deleted successfully" + movie, HttpStatus.OK);
		}
		return responseEntity;
	}

}