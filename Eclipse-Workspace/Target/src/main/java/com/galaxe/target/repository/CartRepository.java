package com.galaxe.target.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.galaxe.target.entity.Cart;
import com.galaxe.target.entity.Product;
import com.galaxe.target.entity.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	public List<Cart> findByUser(User user);
	
	public List<Cart> findByProduct(Product product);

	public Cart findByUserAndProduct(User user, Product product);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Cart WHERE user_email = ?1", nativeQuery = true)
	public void deleteAllByUserEmail(String userEmail);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Cart WHERE product_id = ?1", nativeQuery = true)
	public void deleteAllByProductId(Integer productId);


	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Cart WHERE user_email=?1 AND product_id = ?2", nativeQuery = true)
	public void deleteByUserEmailAndProductId(String userEmail, Integer productId);

}
