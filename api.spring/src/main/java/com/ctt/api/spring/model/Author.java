package com.ctt.api.spring.model;

import java.util.HashSet;
import java.util.Set;

public class Author {

	private int id;
	private String name;
	private String lastName;
	private User user;
	private Set<Post> posts = new HashSet<>();
	
	public Author() {
		
	}
	
	public Author(int id, String name, String lastName, User user) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.user = user;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
