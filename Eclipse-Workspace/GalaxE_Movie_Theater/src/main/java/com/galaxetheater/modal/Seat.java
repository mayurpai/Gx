package com.galaxetheater.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.galaxetheater.enums.SeatBooking;
import com.galaxetheater.enums.SeatCategory;
import com.galaxetheater.enums.SeatType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String rowId;
	private String code;
	private String name;
	private SeatType seatType;
	private double price;
	private SeatCategory seatCategory;
	private SeatBooking seatBooking;

}
