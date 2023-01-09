package com.theater.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.galaxetheater.modal.Seat;

import com.theater.dto.SeatDTO;

@Mapper
public interface SeatMapper {
	
	@Mapping(target="rowId",source="rowId")
	@Mapping(target="code",source="code")
	@Mapping(target="name",source="name")
	@Mapping(target="seatType",source="seatType")
	@Mapping(target="price",source="price")
	public Seat convertToEntity(SeatDTO SeatDTO);
	
	
	@Mapping(target="rowId",source="seat.rowId")
	@Mapping(target="code",source="seat.code")
	@Mapping(target="name",source="seat.name")
	@Mapping(target="seatType",source="seat.seatType")
	@Mapping(target="price",source="seat.price")
	public SeatDTO convertToDto (Seat seat);
	

}
