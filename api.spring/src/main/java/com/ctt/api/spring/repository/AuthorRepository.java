package com.ctt.api.spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ctt.api.spring.db.DB;
import com.ctt.api.spring.model.Author;
import com.ctt.api.spring.model.Post;

@Repository
public class AuthorRepository {


	public List<Author> getAll() {
		return DB.authors;
	}
	
	public Author getById(int id) {
		Author AuthorFinded = null;
		for (Author author  : DB.authors) {
			if (author.getId() == id) {
				AuthorFinded = author;
			}
		}
		return AuthorFinded;
	}
	
	public boolean save(Author Author) {
		int randomID = (int) Math.floor(Math.random() * 10 + 1);
		Author.setId(randomID);
		return DB.authors.add(Author);
	}
	
	public Author edit(int id, Author author) {
		Author authorFinded = this.getById(id);
		int indexOfAuthorFinded = DB.authors.indexOf(authorFinded);
		authorFinded.setName(author.getName());
		authorFinded.setLastName(author.getLastName());
		return DB.authors.set(indexOfAuthorFinded, authorFinded);
	}
	
	public void delete(int id) {
		Author authorFinded = this.getById(id);
		int indexOfAuthorFinded = DB.authors.indexOf(authorFinded);
		DB.authors.remove(indexOfAuthorFinded);
	}
	
	public void deleteAll() {
		 DB.authors.clear();
	}
	
	public int count() {
		return DB.authors.size();
	}
	
	
	public boolean addPost(int id, Post post) {
		Author authorFinded = this.getById(id);
		return authorFinded.getPosts().add(post);
	}
	
	
}
