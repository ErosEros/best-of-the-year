package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Movie;
import com.example.demo.Song;

@Controller
@RequestMapping("/nome")
public class MainController {

	@GetMapping()
//	@ResponseBody  non serve visto che usiamo il file index per visualizzare.
	public String home(Model model) { 
		
		model.addAttribute("name" , "Eros");
		return "index";		
	}
	
//	ROTTA MOVIES
	@GetMapping("/movies")
	public String movie(Model model) {
		List<Movie> movies = getBestMovies();
		model.addAttribute("movies", movies);
		return "movies";
	}

//	ROTTA MOVIES
	@GetMapping("/songs")
	public String song(Model model) {
		List<Song> songs = getBestSongs();
		model.addAttribute("songs", songs);
		return "songs";
	}
	
//	METODO PER PRENDERE I MOVIE
	private List<Movie> getBestMovies(){
//		inizializzo la lista di array
		List<Movie> movies = new ArrayList<>();
		
//      creo il film 1		
		Movie movie1 = new Movie("Batman", 1);
		movies.add(movie1);

//      creo il film 2	
		Movie movie2 = new Movie("One-Piece", 2);
		movies.add(movie2);
		
		return movies;
		
	}
	
	
//	METODO PER PRENDERE LE SONGS
	private List<Song> getBestSongs(){
//		inizializzo la lista di array
		List<Song> songs = new ArrayList<>();
		
//      creo la song 1		
		Song song1 = new Song("Rolls Royce", 1);
		songs.add(song1);

//      creo la song2	
		Song song2 = new Song("Cenere", 2);
		songs.add(song2);
		
		return songs;
		
	}
	
}
