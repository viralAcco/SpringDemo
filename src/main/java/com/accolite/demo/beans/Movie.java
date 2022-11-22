package com.accolite.demo.beans;

public class Movie {
     String genre;
     Creators creators;
     String type;
     int releaseYear;
     double duration;

     public Movie(String genre, Creators creators, String type, int releaseYear, double duration) {
          this.genre = genre;
          this.creators = creators;
          this.type = type;
          this.releaseYear = releaseYear;
          this.duration = duration;
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public Creators getCreators() {
          return creators;
     }

     public void setCreators(Creators creators) {
          this.creators = creators;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public int getReleaseYear() {
          return releaseYear;
     }

     public void setReleaseYear(int releaseYear) {
          this.releaseYear = releaseYear;
     }

     public double getDuration() {
          return duration;
     }

     public void setDuration(double duration) {
          this.duration = duration;
     }

     @Override
     public String toString() {
          return "Movie{" +
                  "genre=" + genre +
                  ", creators=" + creators +
                  ", type='" + type + '\'' +
                  ", releaseYear=" + releaseYear +
                  ", duration=" + duration +
                  '}';
     }
}
