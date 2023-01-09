package com.galaxetheater.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.modal.Movie;

public interface MovieDAO extends JpaRepository<Movie, Integer> {

	// Getting Movie By Code
	Optional<Movie> findByCode(String code);

	// Getting Movie By StatusCode
	public List<Movie> findByMovieStatus(MovieStatus movieStatus);

	// Getting Movie By Name
	public Movie findByName(String name);

	// Getting Movie By Release Date
	public List<Movie> findByReleaseDate(LocalDate releaseDate);
}
