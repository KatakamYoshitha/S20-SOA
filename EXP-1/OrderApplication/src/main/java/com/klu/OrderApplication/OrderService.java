package com.klu.OrderApplication;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepo or;
	
	public String insert(Order o) {
		or.save(o);
		 return "Order Placed Succesfully!!";
	}
	public List<Order> retrieve(){
		return or.findAll();
	}
}
