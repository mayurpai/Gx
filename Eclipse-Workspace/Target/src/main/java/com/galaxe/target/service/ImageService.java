package com.galaxe.target.service;

import java.util.List;

import com.galaxe.target.entity.Image;
import com.galaxe.target.exception.ProductNotFound;

public interface ImageService {
	List<Image> findByProductId(Integer productId) throws ProductNotFound, Exception;
}
