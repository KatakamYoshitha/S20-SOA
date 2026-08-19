package com.klu.ProductApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
	@Autowired
	ProductRepo pr;
	public void insertProduct(Product p) {
		pr.save(p);
	}
	public List<Product> retrieve(){
		return pr.findAll();
	}
}
