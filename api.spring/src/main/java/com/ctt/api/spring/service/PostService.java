package com.ctt.api.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctt.api.spring.model.Post;
import com.ctt.api.spring.repository.PostRepository;

@Service
public class PostService {

	private PostRepository repository;
	private AuthorService authorService;
	
	@Autowired
	public PostService(PostRepository repository, AuthorService authorService) {
		this.repository = repository;
		this.authorService = authorService;
	}
	
	public List<Post> getAllPosts() {
		return this.repository.getAll();
	}
	
	public Post getById(int id) {
		return this.repository.getById(id);
	}
	
	public boolean createPost(Post post) {
		this.repository.save(post);
	
		return this.authorService.addPost(post.getAuthor().getId(), post);
	}
	
	public Post editPost(int id, Post post) {
		return this.repository.edit(id, post);
	}
	
	public void delete(int id) {
		this.repository.delete(id);
	}
}
