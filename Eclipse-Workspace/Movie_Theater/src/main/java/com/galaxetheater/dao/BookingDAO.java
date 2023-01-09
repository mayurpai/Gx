package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.modal.Booking;

public interface BookingDAO extends JpaRepository<Booking, Integer> {

}
