package com.ctt.productpayments.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ctt.productpayments.entity.Category;
import com.ctt.productpayments.entity.Product;
import com.ctt.productpayments.exception.NotFound;
import com.ctt.productpayments.repository.CategoryRepository;
import com.ctt.productpayments.repository.ProductRepository;
import com.ctt.productpayments.request.ProductRequest;
import com.ctt.productpayments.response.ProductResponse;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Product> findByCategory(Long categoryId) {
		// Busca categoria por ID
		Category category = categoryRepository.findById(categoryId).orElseThrow();
		// Busca produtos pela categoria encontrada
		return productRepository.findByCategory(category);
	}

	public List<Product> findByBiggestPriceDesc() {
		return productRepository.findByOrderByPriceDesc();
	}

	public List<Product> findByLowestPriceAsc() {
		return productRepository.findByOrderByPriceAsc();
	}

	public Product findById(Long id) {
		Product product = this.productRepository.findById(id).orElseThrow(() -> new NotFound());
		return product;
	}

	public ProductResponse create(ProductRequest productRequest) {
		Category category = categoryRepository.findById(productRequest.getIdCategory()).orElseThrow();

		Product product = new Product(productRequest, category);
		Product productCreated = this.productRepository.save(product);

		return new ProductResponse(productCreated);
	}

	public ProductResponse update(ProductRequest productRequest, Long id) {

		Product product = this.findById(id);
		product.fillProductFromDto(productRequest);

		this.productRepository.save(product);
		return new ProductResponse(product);
	}

	public List<ProductResponse> getAll(Integer quantity) {
		// FindAll -> Acessa o resultado e não a base de dados
		Page<Product> products = this.productRepository
				.findAll(PageRequest.of(0, quantity, Sort.by(Sort.Direction.ASC, "name")));
		return products.getContent().stream().map(ProductResponse::new).collect(Collectors.toList());

	}

	public ProductResponse get(Long id) {
		Product product = this.findById(id);
		return new ProductResponse(product);
	}

	public void delete(Long id) {
		Product product = this.findById(id);
		this.productRepository.delete(product);
	}

}
