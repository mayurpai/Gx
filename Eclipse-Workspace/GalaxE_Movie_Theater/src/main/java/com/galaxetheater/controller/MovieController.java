package com.galaxetheater.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.exceptions.MovieNotFound;
import com.galaxetheater.modal.Movie;
import com.galaxetheater.service.MovieServiceImpl;

import org.apache.logging.log4j.*;

@RestController
@RequestMapping("movie")
@CrossOrigin
public class MovieController {
	@Autowired
	MovieServiceImpl movieServiceImpl;

//	private static Logger LOGGER = LogManager.getLogger(BookingController.class.getName());

	@PostMapping("saveMovie")
	public ResponseEntity<String> saveMovie(@RequestBody Movie movie) {
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

	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies() {
		ResponseEntity<List<Movie>> responseEntity;
		List<Movie> movieList = movieServiceImpl.getAllMovies();
		if (movieList.isEmpty()) {
			responseEntity = new ResponseEntity<List<Movie>>(movieList, HttpStatus.NO_CONTENT);

		} else {
			responseEntity = new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("movieStatus")
	public List<Movie> movieStatus() {
		List<Movie> movieStatus = movieServiceImpl.findByMovieStatus(MovieStatus.RUNNING);

		return movieStatus;
	}

	@GetMapping("date/{moviedate}")
	public ResponseEntity<?> getMovieByDate(@PathVariable("moviedate") String releaseDate) {
		ResponseEntity<?> responseEntity;
		List<Movie> movieDate = new ArrayList();
		try {
			movieDate = movieServiceImpl.findByReleaseDate(releaseDate);
			responseEntity = new ResponseEntity<List<Movie>>(movieDate, HttpStatus.OK);
		} catch (MovieNotFound e) {
			// TODO Auto-generated catch block
			responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.IM_USED);
//			LOGGER.error("ERROR 404");
			e.printStackTrace();
		}
		return responseEntity;
	}

	@GetMapping("movieName/{name}")
	public ResponseEntity<?> movieName(@PathVariable("name") String name) {
		ResponseEntity<?> responseEntity = null;
		Movie movieList = null;
		try {
			movieList = movieServiceImpl.findByName(name);
			responseEntity = new ResponseEntity<Movie>(movieList, HttpStatus.OK);
		} catch (MovieNotFound e) {
			responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.IM_USED);
//			LOGGER.error("ERROR 404");
			e.printStackTrace();
		}
		return responseEntity;
	}

	@PutMapping("updateMovie")
	public ResponseEntity<String> updateMovie(@RequestBody Movie movie) {
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

	@DeleteMapping("deleteMovie/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable("id") String code) {
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