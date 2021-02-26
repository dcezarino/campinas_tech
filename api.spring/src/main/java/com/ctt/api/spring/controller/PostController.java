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

import com.ctt.api.spring.model.Post;
import com.ctt.api.spring.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private PostService service;
	
	@Autowired
	public PostController(PostService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts() {
		List<Post> posts = this.service.getAllPosts();
		
		if (posts.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok().body(posts);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Post> getPost(@PathVariable("id") Integer id) {
		Post post = this.service.getById(id);
		
		if (post == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		return ResponseEntity.ok(post);
	}
	
	@PostMapping
	public ResponseEntity createPost(@RequestBody Post post) {
		boolean created = this.service.createPost(post);
		
		return created? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@PutMapping("{id}")
	public ResponseEntity<Post> updatePost(@PathVariable("id") Integer id, @RequestBody Post postToBeUpdated) {
	Post post = this.service.getById(id);
		
		if (post == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		Post postUpdated = this.service.editPost(id, postToBeUpdated);
		
		return ResponseEntity.ok(postUpdated);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity deletePost(@PathVariable("id") Integer id) {
		Post post = this.service.getById(id);
		
		if (post == null) {
			return ResponseEntity.noContent().build(); 
		}
		
		this.service.delete(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
}
