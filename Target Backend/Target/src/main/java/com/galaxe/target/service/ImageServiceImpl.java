package com.galaxe.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.target.entity.Image;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.repository.ImageRepository;
import com.galaxe.target.repository.ProductRepository;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ImageRepository imageRepository;

	@Override
	public List<Image> findByProductId(Integer productId) throws ProductNotFound, Exception {
		if (!productRepository.existsByProductId(productId)) {
			throw new ProductNotFound("No Such Product Exists");
		}
		return imageRepository.findByProductId(productId);
	}

}
