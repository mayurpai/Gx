package com.galaxe.target.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galaxe.target.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Boolean existsByUserEmail(String userEmail);
	
	User findByUserEmail(String userEmail);

	User findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
