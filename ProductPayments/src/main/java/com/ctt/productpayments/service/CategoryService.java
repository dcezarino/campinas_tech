package com.ctt.productpayments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.productpayments.entity.Category;
import com.ctt.productpayments.repository.CategoryRepository;
import com.ctt.productpayments.request.CategoryRequest;
import com.ctt.productpayments.response.CategoryResponse;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryResponse create(CategoryRequest categoryRequest) {
		Category category = new Category(categoryRequest);
		Category categoryCreated = this.categoryRepository.save(category);
		return new CategoryResponse(categoryCreated);
	}

}
