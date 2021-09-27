package com.company;

public interface Subject {
    void addRelease(NetflixFilm sub);
    void removeRelease(Observer sub);
    void notification();
}
