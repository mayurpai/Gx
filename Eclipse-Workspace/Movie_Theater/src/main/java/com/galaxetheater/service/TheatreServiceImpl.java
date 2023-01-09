package com.galaxetheater.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theater.dto.RowDto;
import com.galaxetheater.modal.Address;
import com.galaxetheater.modal.Row;
import com.galaxetheater.modal.Seat;
import com.galaxetheater.enums.SeatBooking;
import com.galaxetheater.modal.Theater;
//import com.theater.mapper.RowMapper;
import com.galaxetheater.dao.AddressRepository;
import com.galaxetheater.dao.RowRepository;
import com.galaxetheater.dao.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {

//	@Autowired
//	RowMapper rowMapper;

	@Autowired
	TheatreRepository theatreRepository;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	RowRepository rowRepository;

	@Override
	public String saveTheatre(Theater theatre) {
		// TODO Auto-generated method stub
		theatreRepository.save(theatre);

		return "Saved Successfully";
	}

	@Override
	public boolean isIdExists(int id) {
		// TODO Auto-generated method stub
		Optional<Theater> theatre = theatreRepository.findById(id);
		return theatre.isPresent();
	}

	@Override
	public String saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
		return "Saved Successfully";
	}

	@Override
	public String saveRow(RowDto rowDto) {
		// TODO Auto-generated method stub
		int noOfSeats = rowDto.getNoOfSeats();
		Row row = null;
		int row_id = 0;
		row = rowRepository.findByName(rowDto.getName());
		if (row == null) {
//			row = rowMapper.convertToEntity(rowDto);
			row.setSeats(new ArrayList<Seat>());
			row.setNoOfSeats(0);
			rowRepository.save(row);

		} else {
			row_id = row.getId();
		}
		for (int i = 0; i < noOfSeats; i++) {
			Seat seat = new Seat();
			seat.setSeatBooking(SeatBooking.NOTBOOKED);
			row = rowRepository.findByName(rowDto.getName());
			List<Seat> listOfSeats = row.getSeats();
			listOfSeats.add(seat);
			row.setSeats(listOfSeats);
			row.setNoOfSeats(row.getNoOfSeats() + 1);
			// listOfSeats.add(seat);
			System.out.println(row);
			rowRepository.save(row);

		}
		// System.out.println(noOfSeats);
		// System.out.println(listOfSeats);
		// row.setSeats(listOfSeats);
		return null;
	}

	public Row updateRow(Row row) {
		rowRepository.save(row);
		return row;

	}

	@Override
	public List<Theater> getTheater() {
		return (List<Theater>) theatreRepository.findAll();
	}

}
