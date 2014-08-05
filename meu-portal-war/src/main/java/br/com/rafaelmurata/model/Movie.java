package br.com.rafaelmurata.model;

import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Movie implements Serializable{

	public Movie() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 2646497438231679652L;


	public Movie(Long id,String title, String description, String genre, String trailer) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.trailer = trailer;
	}
    @Id
	public Long id;
	String title;
	String description;
	String genre;
	String trailer;
	

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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	
}
