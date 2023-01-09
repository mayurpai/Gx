package com.galaxetheater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.theater.mapper.BookingMapper;
import com.theater.mapper.BookingMapperImpl;
import com.theater.mapper.RowMapper;
import com.theater.mapper.RowMapperImpl;
import com.theater.mapper.SeatMapper;
import com.theater.mapper.SeatMapperImpl;

@SpringBootApplication
public class MovieTheaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTheaterApplication.class, args);
		System.out.println("application started");
	}

	@Bean
	public SeatMapper getSeat() {
		return new SeatMapperImpl();
	}

	@Bean
	public RowMapper getRowMapper() {
		return new RowMapperImpl();
	}

	@Bean
	public BookingMapper getBookingMapper() {
		return new BookingMapperImpl();
	}
}
