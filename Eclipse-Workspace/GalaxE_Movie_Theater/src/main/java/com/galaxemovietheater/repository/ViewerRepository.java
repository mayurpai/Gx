package com.galaxemovietheater.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.galaxemovietheater.entity.Viewer;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Integer> {
	public List<Viewer> findByUsernameAndConfirmPassword(String Username, String confirmPassword);

	public Viewer findByNewPasswordAndConfirmPassword(String newPassword, String confirmPassword);

	public Optional<Viewer> findByUsername(String Username);
}
