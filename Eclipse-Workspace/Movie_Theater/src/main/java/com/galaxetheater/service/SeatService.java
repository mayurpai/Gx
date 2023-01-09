package com.galaxetheater.service;

import java.util.List;

import com.galaxetheater.modal.Seat;
import com.theater.dto.SeatDTO;


public interface SeatService {
	public List<Seat> getAllSeats();
		
	public String editSeats(Seat seat);
	
	public String deleteSeat(int id);

	public String saveSeat(Seat seat);

	
	

}
