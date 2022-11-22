package com.accolite.demo.service;

import com.accolite.demo.beans.Movie;
import com.accolite.demo.beans.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepo movieRepo;

    public List<Movie> getChristopherNolanMovies(){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movieRepo.getInception());
        movies.add(movieRepo.getInterstellar());

        return movies;
    }
}
