package com.example.demo;

public class Movie {

		String title;
		int id;
		
//		COSTRUTTORE
		public Movie(String title, int id) {
			super();
			this.title = title;
			this.id = id;
		}

		
//		GETTERS E SETTERS
		public String getTitle() {
			return title;
		}

		public int getId() {
			return id;
		}
		
		@Override
		public String toString() {
			return "Movie [title=" + title + "]";
		}

}
