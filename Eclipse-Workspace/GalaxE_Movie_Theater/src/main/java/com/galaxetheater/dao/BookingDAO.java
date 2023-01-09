package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.modal.Booking;

public interface BookingDAO extends JpaRepository<Booking, Integer> {

//	public Optional<Booking> findByCode(String code);

//	@Query(value = "DELETE FROM Ticket t WHERE t.booking_fk = ?1", nativeQuery = true)
//	public String deleteBookingByBookingFk(Integer id);

//	@Query(value = "DELETE FROM Seat s WHERE s.seat_fk = ?1", nativeQuery = true)
//	public String deleteBookingBySeatFk(Integer id);
	

}
