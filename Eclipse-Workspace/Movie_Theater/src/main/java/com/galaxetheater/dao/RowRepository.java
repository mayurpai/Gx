package com.galaxetheater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxetheater.modal.Row;

public interface RowRepository extends JpaRepository<Row, Integer> {
	public Row findByName(String name);
}
