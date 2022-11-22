package com.accolite.demo.controller;

import com.accolite.demo.beans.Movie;
import com.accolite.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    MovieService service;

    public MovieService getService() {
        return service;
    }

    @Autowired
    public void setService(MovieService service) {
        this.service = service;
    }

    @GetMapping("/christopher")
    public List<Movie> getChristopherNolan(){
        return service.getChristopherNolanMovies();
    }
}
