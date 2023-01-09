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
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return (List<Movie>) movieDAO.findAll();
	}

	@Override
	public String saveMovies(Movie movie) {
		// TODO Auto-generated method stub
		movieDAO.save(movie);
		return "saved successfully";
	}

	@Override
	public String editMovies(Movie movie) {
		// TODO Auto-generated method stub
		movieDAO.save(movie);
		return "Updated successfully";
	}

	@Override
	public String deleteMovies(String code) {
		// TODO Auto-generated method stub
		Optional<Movie> movie = movieDAO.findByCode(code);
		movieDAO.delete(movie.get());
		return "Deleted successfully";
	}

	public boolean isMovieExists(String code) {
		// TODO Auto-generated method stub
		Optional<Movie> movie = movieDAO.findByCode(code);
		return movie.isPresent();
	}

	@Override
	public List<Movie> findByMovieStatus(MovieStatus movieStatus) {
		// TODO Auto-generated method stub
		List<Movie> moviestatus = movieDAO.findByMovieStatus(movieStatus);
		return moviestatus;
	}

//	@Override
//	public boolean isMovieExists(String name) {
//		Optional<Movie> movie = movieDAO.findById(mobileId);
//		return mobilePhone.isPresent();
//	}

	@Override
	public Movie findByName(String name) throws MovieNotFound {
		Movie movies = movieDAO.findByName(name);
		System.out.println(movies);
//		try {
		if (movies != null && movies.getMovieStatus() == MovieStatus.RUNNING) {
			return movies;
		} else {
			throw new MovieNotFound("Movie Not Found");
		}
//		} catch (Exception e) {
//			throw new MovieNotFound("Movie Not Found");
//		}
//		return null;
	}

	@Override
	public List<Movie> findByReleaseDate(String releaseDate) throws MovieNotFound {
		LocalDate localDate = LocalDate.parse(releaseDate); // converting datatype from String to Localdate in postman
		List<Movie> moviedate = movieDAO.findByReleaseDate(localDate);
		if (!moviedate.isEmpty()) {
			System.out.println(moviedate);
			return moviedate;
		} else {
			throw new MovieNotFound("Movie Not Found");
		}
	}

}