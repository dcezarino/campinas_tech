package com.ctt.api.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.api.spring.dto.AuthorDTO;
import com.ctt.api.spring.model.Author;
import com.ctt.api.spring.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	private AuthorService service;
	
	@Autowired
	public AuthorController(AuthorService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
		List<Author> authors = this.service.getAllAuthors();
		List<AuthorDTO> authorsDTO = this.service.convertAuthorsForDTO(authors);
		if (authors.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok().body(authorsDTO);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<AuthorDTO> getAuthor(@PathVariable("id") Integer id) {
		Author Author = this.service.getById(id);
		
		if (Author == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		return ResponseEntity.ok(new AuthorDTO(Author));
	}
	
	@PostMapping
	public ResponseEntity createAuthor(@RequestBody Author Author) {
		boolean created = this.service.createAuthor(Author);
		
		return created? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@PutMapping("{id}")
	public ResponseEntity<Author> updateAuthor(@PathVariable("id") Integer id, @RequestBody Author AuthorToBeUpdated) {
	Author Author = this.service.getById(id);
		
		if (Author == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		Author AuthorUpdated = this.service.editAuthor(id, AuthorToBeUpdated);
		
		return ResponseEntity.ok(AuthorUpdated);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity deleteAuthor(@PathVariable("id") Integer id) {
		Author Author = this.service.getById(id);
		
		if (Author == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		this.service.delete(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
}
