package com.company;

public class Main {

        public static void main(String[] args) {
            NetflixRelease netflixRelease = new NetflixRelease();

            NetflixFilm film1 = new NetflixFilm("Teenwolf","10 March 2010");
            NetflixFilm film2 = new NetflixFilm("Vampire Diaries","15 October 2017");
            NetflixFilm film3 = new NetflixFilm("Penthouse","20 June 2021");

            netflixRelease.addRelease(film1);
            netflixRelease.addRelease(film2);
            netflixRelease.addRelease(film3);

//        netflixRelease.removeRelease(film1);
//        netflixRelease.removeRelease(film2);
//        netflixRelease.removeRelease(film3);

            netflixRelease.notification();
        }
    }
