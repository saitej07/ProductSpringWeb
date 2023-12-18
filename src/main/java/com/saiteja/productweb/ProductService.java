package com.saiteja.productweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
	
	@Autowired
	ProductDB db;

	public List<Product> getAllProducts() {
		
		return db.findAll();
	}

	public Product getProduct(String name) {
		
		return db.findByName(name);
	}

	public Product addProduct(@RequestBody Product p) {
		
		return db.save(p);
	}

	
}
