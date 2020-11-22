package br.com.carlos.product.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.product.model.Product;
import br.com.carlos.product.service.ProductService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("v1/products")
@AllArgsConstructor
public class ProductResource {

	private ProductService service;

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(service.create(product), HttpStatus.CREATED);
	}

}
