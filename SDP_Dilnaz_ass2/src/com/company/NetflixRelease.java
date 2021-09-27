package com.company;

import java.util.ArrayList;
import java.util.List;

public class NetflixRelease implements Subject{

    List<NetflixFilm> films;

    public NetflixRelease(){
        films = new ArrayList<>();
    }
    @Override
    public void addRelease(NetflixFilm sub) {
        films.add(sub);
    }

    @Override
    public void removeRelease(Observer sub) {
        if (films.indexOf(sub) >= 0) {
            films.remove(films.indexOf(sub));
        }
    }
    @Override
    public void notification() {
        for(NetflixFilm sub: films){
            sub.update();
        }
    }
}
