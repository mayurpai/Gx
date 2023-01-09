package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.modal.Seat;

public interface SaveRepository extends JpaRepository<Seat, Integer> {

}
