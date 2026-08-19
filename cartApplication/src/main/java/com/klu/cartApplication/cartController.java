package com.klu.cartApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class cartController {
	@Autowired
	cartService cs;
	
	@PostMapping("/insertcarts")
	public void insertCart(@RequestBody cart c) {
		cs.insertCart(c);
	}
	@GetMapping("/retrieve")
	public List<cart> retrieveCart(){
		return cs.retrieveCart();
	}

}
