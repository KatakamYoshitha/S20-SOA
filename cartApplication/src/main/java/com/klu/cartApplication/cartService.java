package com.klu.cartApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cartService {
	@Autowired
	cartRepo cr;
	public void insertCart(cart c) {
		cr.save(c);
	}
	public List<cart> retrieveCart(){
		return cr.findAll();
	}
}
