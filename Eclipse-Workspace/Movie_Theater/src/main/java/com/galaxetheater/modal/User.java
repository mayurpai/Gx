package com.galaxetheater.modal;

import java.util.List;

import javax.persistence.criteria.Order;

import com.galaxetheater.enums.UserType;

public class User {

	private int id;
	private String code;
	private  UserType userType;
	private UserDetails userDetails;
	private List<Booking> booking;
	private List<Order> orders;
	private int cartId;
	
}
