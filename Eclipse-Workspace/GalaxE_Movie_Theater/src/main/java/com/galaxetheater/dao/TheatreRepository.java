package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.modal.Theater;

public interface TheatreRepository extends JpaRepository<Theater, Integer> {

}
