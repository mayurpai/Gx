package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.galaxetheater.modal.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer> {

}