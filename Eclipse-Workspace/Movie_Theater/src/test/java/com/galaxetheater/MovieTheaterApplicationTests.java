package com.galaxetheater;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.galaxetheater.dao.MovieDAO;
import com.galaxetheater.enums.MovieStatus;
import com.galaxetheater.exceptions.MovieNotFound;
import com.galaxetheater.modal.Movie;
import com.galaxetheater.service.MovieServiceImpl;

@SpringBootTest(classes = { MovieTheaterApplicationTests.class })
class MovieTheaterApplicationTests {

	@Mock
	private MovieDAO movieDao;
	@InjectMocks
	private MovieServiceImpl movieServiceImpl;

	@Test
	void FindByNameExists() {
		Movie movie = new Movie(1, "MOV01", "KGF Chapter 1", "Drama", LocalDate.parse("2018-10-12"), "176",
				MovieStatus.RUNNING, "Yash", "https://kgf.png");
		when(movieDao.findByName(movie.getName())).thenReturn(movie);
		assertEquals(movie, movieServiceImpl.findByName("KGF Chapter 1"));
	}

}
