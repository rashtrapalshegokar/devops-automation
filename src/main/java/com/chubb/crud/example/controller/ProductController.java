package com.chubb.crud.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.chubb.crud.example.entity.Product;
import com.chubb.crud.example.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    
    @Autowired
	private KafkaTemplate<String, Object> template;

	private String topic = "rajdb";
	

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
    	template.send(topic, product);
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
    	template.send(topic, service.getProductById(id));
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
