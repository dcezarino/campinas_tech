package com.ctt.api.spring.model;

public class Post {

	private int id;
	private String title;
	private String description;
	private Author author;

	public Post() {
		
	}
	
	public Post(int id, String title, String description, Author author) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
