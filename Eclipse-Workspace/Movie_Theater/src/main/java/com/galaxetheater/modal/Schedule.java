package com.galaxetheater.modal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
private int id;
private String code;
private String name;
private Movie movie;
private LocalDateTime startTime;
private LocalDateTime endTime;


}
