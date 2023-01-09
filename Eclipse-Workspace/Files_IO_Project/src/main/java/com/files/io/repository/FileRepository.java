package com.files.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.files.io.entity.ResponseData;

@Repository
public interface FileRepository extends JpaRepository<ResponseData, String> {
	public ResponseData findByFileName(String fileName);
}
