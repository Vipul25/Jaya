package com.example.jaya.biodata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie(Movies movie){
        movieRepository.save(movie);
    }

    public List<Movies> getMovies(){
        return movieRepository.findAll();
    }
}
