package com.ctt.api.spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ctt.api.spring.db.DB;
import com.ctt.api.spring.model.Post;

@Repository
public class PostRepository {


	public List<Post> getAll() {
		return DB.posts;
	}
	
	public Post getById(int id) {
		Post postFinded = null;
		for (Post post  : DB.posts) {
			if (post.getId() == id) {
				postFinded = post;
			}
		}
		return postFinded;
	}
	
	public boolean save(Post post) {
		int randomID = (int) Math.floor(Math.random() * 10 + 1);
		post.setId(randomID);
//		post.setCreatedAt(LocalDateTime.now());
		return DB.posts.add(post);
	}
	
	public Post edit(int id, Post post) {
		Post postFinded = this.getById(id);
		int indexOfPostFinded = DB.posts.indexOf(postFinded);
		postFinded.setDescription(post.getDescription());
		postFinded.setTitle(post.getTitle());
		return DB.posts.set(indexOfPostFinded, postFinded);
	}
	
	public void delete(int id) {
		Post postFinded = this.getById(id);
		int indexOfPostFinded = DB.posts.indexOf(postFinded);
		DB.posts.remove(indexOfPostFinded);
	}
	
	public void deleteAll() {
		 DB.posts.clear();
	}
	
	public int count() {
		return DB.posts.size();
	}
	
//	public Set<Post> getByAuthor(Author author) {
//		List<Post> posts = this.getAll();
//		Set<Post> postsAuthor = new HashSet<>();
//		for (Post post : posts) {
//			if (post.getAuthor().getId() == author.getId()) {
//				postsAuthor.add(post);
//			}
//		}
//		return postsAuthor;
//	}
}
