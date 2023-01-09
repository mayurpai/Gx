package com.theater.dto;

import com.galaxetheater.enums.SeatType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RowDto {

	private String code;
	private String name;
	private double price;
	private SeatType seatType;
	private int noOfSeats;
}
