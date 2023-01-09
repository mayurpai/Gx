package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.galaxetheater.modal.Seat;

public interface SeatDAO extends JpaRepository<Seat, Integer> {

//	@Query(value = "UPDATE seat SET  = 'Pune' WHERE ID = 6, nativeQuery = true)
//	public void changeBookingStatus(int id);
	
	@Query(value = "DELETE FROM seat s WHERE s.seat_fk = ?1", nativeQuery = true)
	public void deleteBookingBySeatFk(int id);

}
