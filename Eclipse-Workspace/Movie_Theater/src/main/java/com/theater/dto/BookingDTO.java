package com.theater.dto;

import java.util.List;

import com.galaxetheater.enums.SeatType;
import com.galaxetheater.modal.Seat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {
	/*
	 * DTO For Booking Entity
	 */
	private String code;
	private String name;
	private double price;
	private List<Seat> seats;
	private double totalPrice;
}
