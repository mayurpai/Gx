package com.galaxetheater.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxetheater.dao.SeatDAO;
import com.galaxetheater.modal.Seat;
import com.theater.dto.SeatDTO;
import com.theater.mapper.SeatMapper;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	SeatDAO seatDAO;
	@Autowired
	SeatMapper seatMapper;

	@Override
	public List<Seat> getAllSeats() {
		// TODO Auto-generated method stub

		return (List<Seat>) seatDAO.findAll();

	}

	@Override
	public String saveSeat(Seat seat) {
		// TODO Auto-generated method stub
//		Seat seat=seatMapper.convertToEntity(seat);
		seatDAO.save(seat);
		return "Saved Successfully";

	}

	@Override
	public String editSeats(Seat seat) {
		// TODO Auto-generated method stub
//		Seat seat = seatDAO.findByRowId(seatDto.getRowId()).get();
//		System.out.println(seat);
//		int seatId = seat.getId();
//		seat = seatMapper.convertToEntity(seatDto);
//		seat.setId(seatId);
		seatDAO.save(seat);
		return "updated successfully";

	}

	@Override
	public String deleteSeat(int seatId) {
		// TODO Auto-generated method stub
		Optional<Seat> seat = seatDAO.findById(seatId);
		seatDAO.delete(seat.get());
		return "deleted successfully";

	}

	public boolean isSeatExists(int seatId) {
		// TODO Auto-generated method stub
		Optional<Seat> seat = seatDAO.findById(seatId);
		return seat.isPresent();
	}

}
