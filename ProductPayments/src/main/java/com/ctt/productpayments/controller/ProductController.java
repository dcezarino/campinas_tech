package com.ctt.productpayments.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.productpayments.entity.Product;
import com.ctt.productpayments.request.ProductRequest;
import com.ctt.productpayments.response.ProductResponse;
import com.ctt.productpayments.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/findByCategory/{idCategory}")
	public List<Product> findByCategory(@PathVariable Long idCategory) {
		return this.productService.findByCategory(idCategory);
	}

	@GetMapping(value = "orderBiggestPrice")
	public List<Product> getProductOrderBiggestPrice() {
		return this.productService.findByBiggestPriceDesc();
	}

	@GetMapping(value = "orderLowestPrice")
	public List<Product> getProductOrderLowestPrice() {
		return this.productService.findByLowestPriceAsc();
	}

	@GetMapping(produces = "application/json")
	public List<ProductResponse> get(@RequestParam(defaultValue = "12", required = false) Integer quantity) {
		return this.productService.getAll(quantity);
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public ProductResponse get(@PathVariable Long id) {
		return this.productService.get(id);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductResponse post(@Valid @RequestBody ProductRequest productRequest) {
		return this.productService.create(productRequest);
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public ProductResponse put(@Valid @RequestBody ProductRequest productRequest, @PathVariable Long id) {
		return this.productService.update(productRequest, id);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		this.productService.delete(id);
	}

}
