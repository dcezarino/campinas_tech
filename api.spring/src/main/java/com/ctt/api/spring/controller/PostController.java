package com.ctt.api.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctt.api.spring.model.Post;

//Criação dos métodos controller
@RestController
@RequestMapping("/posts")
public class PostController {

	// Inserindo o método GET
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Post> getAllPosts() {
		Post post = new Post(1, "Meu primeiro Post", "getAllPosts");
		return Arrays.asList(post, post, post);
	}

	// Injetar o valor que está na url nessa variável String id.
	// @RequestMapping(value = "{id}", method = RequestMethod.GET)
	@GetMapping("{id}")
	public Post getPost(@PathVariable("id") Integer id) {
		return new Post(id, "Meu Post com ID", "getPost");
	}

	// @RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public Post createPost(@RequestBody Post post) {
		int randomID = (int) Math.floor(Math.random() * 10 + 1);
		post.setId(randomID);
		return post;
	}

	// @RequestMapping(value = "{id}", method = RequestMethod.PUT)
	@PutMapping("{id}")
	public Post updatePost(@PathVariable("id") Integer id, @RequestBody Post post) {
		Post postFake = new Post(1, "Meu primeiro Post", "lorem ipsum catipms isso....");
		Post postARetorar = null;
		List<Post> posts = Arrays.asList(postFake, postFake, postFake);
		for (Post post2 : posts) {
			if (post2.getId() == id) {
				post2.setDescription(post.getDescription());
				post2.setTitle(post.getTitle());
				postARetorar = post2;
			}
		}
		return postARetorar;
	}
	@DeleteMapping("{id}")
	public boolean deletePost(@PathVariable("id") Integer id) {
		if (id == 1) {
			return true;
		}
		return false;
	}
}