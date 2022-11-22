package com.accolite.demo.config;

import com.accolite.demo.beans.Creators;
import com.accolite.demo.beans.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.accolite.demo.beans", "com.accolite.demo.service", "com.accolite.demo.controller"})
public class MovieConfig {

    @Bean("ChristopherNolan")
    public Creators creator1(){
        return new Creators("ChristopherNolan", "WarnerBros");
    }
    @Bean("MakotoShinkai")
    public Creators creator2(){
        return new Creators("MakotoShinkai", "ComixWave");
    }
    @Bean("FrancisCoppola")
    public Creators creator3(){
        return new Creators("FrancisCoppola", "ParamountPictures");
    }
    @Bean("Disney")
    public Creators creator4(){
        return new Creators("AdrianMolina", "Disney");
    }
    @Bean("SRK")
    public Creators creator5(){
        return new Creators("Karan Johar", "DharmaProduction");
    }
    @Bean("ZoyaAkhtar")
    public Creators creator6(){
        return new Creators("Zoya Akhtar", "ExcelEntertainments");
    }

    @Bean("ZindagiNaMilegiDobara")
    public Movie movie2(){
        return new Movie("Adventure", creator6(), "Bollywood", 2011, 2.33);
    }

    @Bean("Interstellar")
    public Movie movie1(){
        return new Movie("Sci-fi", creator1(), "Hollywood", 2014, 2.49);
    }

    @Bean("TheGodfather")
    public Movie movie3(){
        return new Movie("Crime/Drama", creator3(), "Hollywood", 1972, 2.55);
    }
    @Bean("Coco")
    public Movie movie4(){
        return new Movie("Adventure", creator4(), "Animated", 2017, 1.45);
    }
    @Bean("Inception")
    public Movie movie5(){
        return new Movie("Action/Sci-fi", creator1(), "Hollywood", 2010, 2.28);
    }
    @Bean("MyNameIsKhan")
    public Movie movie6(){
        return new Movie("Drama/Romance", creator5(), "Bollywood", 2010, 2.45);
    }
    @Bean("YourName")
    public Movie movie7(){
        return new Movie("Romance/Fantacy", creator2(), "Anime", 2016, 1.52);
    }
}
