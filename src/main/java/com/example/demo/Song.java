package com.example.demo;

public class Song {
	
	private String title;
	private int id;
	
	//	COSTRUTTORE
	public Song(String title, int id) {
		super();
		this.title = title;
		this.id = id;
	}
	
//	GETTERS E SETTERS
	
public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return title; 
	}
	
}
