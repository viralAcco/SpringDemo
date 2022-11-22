package com.accolite.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieRepo {
    Movie Interstellar;
    Movie ZindagiNaMilegiDobara;
    Movie TheGodfather;

    Movie Coco;
    Movie MyNameIsKhan;
    Movie YourName;

    Movie Inception;

    public Movie getInterstellar() {
        return Interstellar;
    }

    @Autowired
    @Qualifier("Interstellar")
    public void setInterstellar(Movie interstellar) {
        Interstellar = interstellar;
    }

    public Movie getZindagiNaMilegiDobara() {
        return ZindagiNaMilegiDobara;
    }

    @Autowired
    @Qualifier("ZindagiNaMilegiDobara")
    public void setZindagiNaMilegiDobara(Movie zindagiNaMilegiDobara) {
        ZindagiNaMilegiDobara = zindagiNaMilegiDobara;
    }

    public Movie getTheGodfather() {
        return TheGodfather;
    }

    @Autowired
    @Qualifier("TheGodfather")
    public void setTheGodfather(Movie theGodfather) {
        TheGodfather = theGodfather;
    }

    public Movie getCoco() {
        return Coco;
    }

    @Autowired
    @Qualifier("Coco")
    public void setCoco(Movie coco) {
        Coco = coco;
    }

    public Movie getMyNameIsKhan() {
        return MyNameIsKhan;
    }

    @Autowired
    @Qualifier("MyNameIsKhan")
    public void setMyNameIsKhan(Movie myNameIsKhan) {
        MyNameIsKhan = myNameIsKhan;
    }

    public Movie getYourName() { return YourName; }

    @Autowired
    @Qualifier("YourName")
    public void setYourName(Movie yourName) {
        YourName = yourName;
    }

    public Movie getInception() {
        return Inception;
    }

    @Autowired
    @Qualifier("Inception")
    public void setInception(Movie inception) {
        Inception = inception;
    }

    @Override
    public String toString() {
        return "MovieRepo{" +
                "Interstellar=" + Interstellar +
                ", ZindagiNaMilegiDobara=" + ZindagiNaMilegiDobara +
                ", TheGodfather=" + TheGodfather +
                ", Coco=" + Coco +
                ", MyNameIsKhan=" + MyNameIsKhan +
                ", YourName=" + YourName +
                '}';
    }
}
