package com.galaxetheater.service;

import com.galaxetheater.modal.Theater;
import com.theater.dto.RowDto;

import java.util.List;

import com.galaxetheater.modal.Address;

public interface TheatreService {
	public String saveTheatre(Theater theatre);

	public String saveAddress(Address address);

	public String saveRow(RowDto rowDto);

	public boolean isIdExists(int id);

	public List<Theater> getTheater();
}
