package com.accolite.demo.beans;

public class Creators {
    String director;
    String productionStudio;

    public Creators(String director, String productionStudio) {
        this.director = director;
        this.productionStudio = productionStudio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductionStudio() {
        return productionStudio;
    }

    public void setProductionStudio(String productionStudio) {
        this.productionStudio = productionStudio;
    }

    @Override
    public String toString() {
        return "Creators{" +
                ", director='" + director + '\'' +
                ", productionStudio='" + productionStudio + '\'' +
                '}';
    }
}
