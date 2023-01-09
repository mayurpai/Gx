package com.galaxetheater.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.modal.Movie;

public interface MovieDAO extends JpaRepository<Movie, Integer> {
	Optional<Movie> findByCode(String code);

	public List<Movie> findByMovieStatus(MovieStatus movieStatus);

	public Movie findByName(String name);
	
	public List<Movie> findByReleaseDate(LocalDate releaseDate);
}
