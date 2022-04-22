package com.example.oblig3;

public class Film {
    private String tittel;
    private String director;

    public Film(String tittel, String director) {
        this.tittel = tittel;
        this.director = director;
    }

    public Film() {
    }

    public String getTittel() { return tittel; }

    public void setTittel(String tittel) { this.tittel = tittel; }

    public String getDirector() { return director; }

    public void setDirector(String director) { this.director = director; }

}

