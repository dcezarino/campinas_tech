package com.ctt.api.spring.dto;

import java.util.HashSet;
import java.util.Set;

import com.ctt.api.spring.model.Author;
import com.ctt.api.spring.model.Post;

public class AuthorDTO {

	
	private int id;
	private String name;
	private String lastName;
	private Set<PostDTO> posts = new HashSet<>();
	
	public AuthorDTO(Author author) {
		this.id = author.getId();
		this.name = author.getName();
		this.lastName = author.getLastName();
		for(Post postOfAuthor: author.getPosts()) {
			this.posts.add(new PostDTO(postOfAuthor));
		}
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public Set<PostDTO> getPosts() {
		return posts;
	}
}
