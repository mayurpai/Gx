package com.theater.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.galaxetheater.modal.Booking;
import com.theater.dto.BookingDTO;

@Mapper
public interface BookingMapper {

	@Mapping(target = "code", source = "booking.code")
	@Mapping(target = "name", source = "booking.name")
	@Mapping(target = "seats", source = "booking.seats")
	@Mapping(target = "totalPrice", source = "booking.totalPrice")

	public BookingDTO convertToDto(Booking booking);

//	public List<BookingDTO> convertModelsToDtos(List<Booking> booking);

	@Mapping(target = "code", source = "bookingDTO.code")
	@Mapping(target = "name", source = "bookingDTO.name")
	@Mapping(target = "seats", source = "bookingDTO.seats")
	@Mapping(target = "totalPrice", source = "bookingDTO.totalPrice")

	public Booking convertToEntity(BookingDTO bookingDTO);

}
