package com.theater.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.theater.dto.RowDto;
import com.galaxetheater.modal.Row;

@Mapper
public interface RowMapper {

	@Mapping(source = "code", target = "code")
	@Mapping(source = "name", target = "name")
	@Mapping(source = "price", target = "price")
	@Mapping(source = "seatType", target = "seatType")
	public RowDto convertToDto(Row row);

	@Mapping(source = "code", target = "code")
	@Mapping(source = "name", target = "name")
	@Mapping(source = "price", target = "price")
	@Mapping(source = "seatType", target = "seatType")
	public Row convertToEntity(RowDto rowDto);
}
