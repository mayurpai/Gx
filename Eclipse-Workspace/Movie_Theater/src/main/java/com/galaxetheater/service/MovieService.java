package com.galaxetheater.service;

import java.util.List;

import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.exceptions.MovieNotFound;
import com.galaxetheater.modal.Movie;

public interface MovieService {
	public List<Movie> getAllMovies();

	public String saveMovies(Movie movie);

	public String editMovies(Movie movie);

	public String deleteMovies(String code);

	public List<Movie> findByMovieStatus(MovieStatus movieStatus);

	public Movie findByName(String name) throws MovieNotFound;

//	public Movie findByName(String name);

	public List<Movie> findByReleaseDate(String releaseDate) throws MovieNotFound;

	public boolean isMovieExists(String code);

}