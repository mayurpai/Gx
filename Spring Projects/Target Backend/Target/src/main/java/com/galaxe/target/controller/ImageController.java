package com.galaxe.target.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.target.entity.Image;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.service.ImageService;

@RestController
@RequestMapping("image/api/v1")
@CrossOrigin("http://localhost:3000/")
public class ImageController {

	@Autowired
	ImageService imageService;

	@GetMapping("GET/{productId}")
	public List<Image> getImageByProductById(@PathVariable Integer productId) throws ProductNotFound, Exception {
		try {
			return imageService.findByProductId(productId);
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}
}
