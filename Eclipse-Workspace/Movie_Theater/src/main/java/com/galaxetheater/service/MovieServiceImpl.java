package com.galaxetheater.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxetheater.dao.MovieDAO;
import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.exceptions.MovieNotFound;
import com.galaxetheater.modal.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO movieDAO;

	@Override
	// Get All Movies From Database
	public List<Movie> getAllMovies() {
		return (List<Movie>) movieDAO.findAll();
	}

	@Override
	// Post Movie To Database
	public String saveMovies(Movie movie) {
		movieDAO.save(movie);
		return "saved successfully";
	}

	@Override
	// Update Movie From Database
	public String editMovies(Movie movie) {
		movieDAO.save(movie);
		return "Updated successfully";
	}

	@Override
	// Delete Movie From Database
	public String deleteMovies(String code) {
		Optional<Movie> movie = movieDAO.findByCode(code);
		movieDAO.delete(movie.get());
		return "Deleted successfully";
	}

	// Check If Movie Exists In Database
	public boolean isMovieExists(String code) {
		Optional<Movie> movie = movieDAO.findByCode(code);
		return movie.isPresent();
	}

	@Override
	// Get Movie From Database By Movie Status
	public List<Movie> findByMovieStatus(MovieStatus movieStatus) {
		List<Movie> moviestatus = movieDAO.findByMovieStatus(movieStatus);
		return moviestatus;
	}

	@Override
	// Get Movie By Movie Name From Database
	public Movie findByName(String name) throws MovieNotFound {
		Movie movies = movieDAO.findByName(name);
		System.out.println(movies);
		if (movies != null && movies.getMovieStatus() == MovieStatus.RUNNING) {
			return movies;
		} else {
			throw new MovieNotFound("Movie Not Found");
		}
	}

	@Override
	// Get Movie By Release Date From Database
	public List<Movie> findByReleaseDate(String releaseDate) throws MovieNotFound {
		LocalDate localDate = LocalDate.parse(releaseDate);
		List<Movie> moviedate = movieDAO.findByReleaseDate(localDate);
		if (!moviedate.isEmpty()) {
			System.out.println(moviedate);
			return moviedate;
		} else {
			throw new MovieNotFound("Movie Not Found");
		}
	}
}