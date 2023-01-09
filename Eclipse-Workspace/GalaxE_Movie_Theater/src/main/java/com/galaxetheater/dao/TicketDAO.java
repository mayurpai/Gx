package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.galaxetheater.modal.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer> {

	@Query(value = "DELETE FROM ticket t WHERE t.booking_fk = ?1", nativeQuery = true)
	public void deleteBookingByBookingFk(int id);
}