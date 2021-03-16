package com.ctt.productpayments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctt.productpayments.entity.Category;
import com.ctt.productpayments.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByCategory(Category category);

	List<Product> findByOrderByPriceAsc();

	List<Product> findByOrderByPriceDesc();
	
	// Busca os produtos pelo id passado.
	List<Product> findProductByIdIn (List<Long> ProductIds);

	
	
	

}
