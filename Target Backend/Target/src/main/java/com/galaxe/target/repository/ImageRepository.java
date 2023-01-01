package com.galaxe.target.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.galaxe.target.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

	@Query(value = "SELECT * FROM `new-target`.image where product_id = ?1", nativeQuery = true)
	public List<Image> findByProductId(Integer productId);
}
