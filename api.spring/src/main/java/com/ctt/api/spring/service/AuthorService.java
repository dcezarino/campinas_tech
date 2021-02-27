package com.ctt.api.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.api.spring.dto.AuthorDTO;
import com.ctt.api.spring.model.Author;
import com.ctt.api.spring.model.Post;
import com.ctt.api.spring.repository.AuthorRepository;

@Service
public class AuthorService {

	private AuthorRepository repository;
	
	@Autowired
	public AuthorService(AuthorRepository repository) {
		this.repository = repository;
	}
	
	public List<Author> getAllAuthors() {
		return this.repository.getAll();
	}
	
	public Author getById(int id) {
		return this.repository.getById(id);
	}
	
	public boolean createAuthor(Author Author) {
		return this.repository.save(Author);
	}
	
	public Author editAuthor(int id, Author Author) {
		return this.repository.edit(id, Author);
	}
	
	public void delete(int id) {
		this.repository.delete(id);
	}
	
	public boolean addPost(int id, Post post) {
		return this.repository.addPost(id, post);
	}
	
	public List<AuthorDTO> convertAuthorsForDTO(List<Author> authors) {
		List<AuthorDTO> authorsDTO = new ArrayList<AuthorDTO>();
		for(Author author : authors) {
			authorsDTO.add(new AuthorDTO(author));
		}
		return authorsDTO;
	}
	
}
