package com.ctt.api.spring.dto;

import com.ctt.api.spring.model.Post;

public class PostDTO {

	private int id;
	private String title;
	private String description;
	
	
	public PostDTO(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.description = post.getDescription();
	}


	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
}
