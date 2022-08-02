package com.chubb.crud.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import com.chubb.crud.example.entity.Product;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
	private KafkaTemplate<String, Object> template;

	private String topic = "rajdb";
	

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
    	template.send(topic, product);
    	return product;
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
    	template.send(topic, products);
    	return products;
    }

   
}
