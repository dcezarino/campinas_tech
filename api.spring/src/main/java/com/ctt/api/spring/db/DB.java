package com.ctt.api.spring.db;

import java.util.ArrayList;
import java.util.List;

import com.ctt.api.spring.model.Author;
import com.ctt.api.spring.model.Post;

public class DB {

	public static List<Post> posts = new ArrayList<>();
	public static List<Author> authors = new ArrayList<>();
	
	private DB() {
		
	}
	
}
