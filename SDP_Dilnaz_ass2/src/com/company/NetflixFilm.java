package com.company;

public class NetflixFilm implements Observer{
    private String nameOfFilms;
    private String dateOfFilms;
    public NetflixFilm(){}
    public NetflixFilm(String nameOfFilms, String dateOfFilms){
        this.nameOfFilms = nameOfFilms;
        this.dateOfFilms = dateOfFilms;
    }
    @Override
    public void update() {
        System.out.println("_____________________________________________________________");
        System.out.println("Name of a new film: " + nameOfFilms);
        System.out.println("Date of a new film: " + dateOfFilms);
        System.out.println("_____________________________________________________________");
    }
}
