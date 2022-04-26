package com.example.oblig3;

public class Billett implements Comparable<Billett>{
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefon;
    private String epost;
    private String valgtFilm;

    public Billett(String antall, String fornavn, String etternavn, String telefon, String epost) {
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.epost = epost;
    }

    public Billett() {
    }
        public String getAntall() { return antall; }

        public void setAntall(String antall) { this.antall = antall; }

        public String getFornavn() { return fornavn; }

        public void setFornavn(String fornavn) { this.fornavn = fornavn; }

        public String getEtternavn() { return etternavn; }

        public void setEtternavn(String etternavn) { this.etternavn = etternavn; }

        public String getTelefon() { return telefon; }

        public void setTelefon(String telefon) { this.telefon = telefon; }

        public String getEpost() { return epost; }

        public void setEpost(String epost) { this.epost = epost; }

        public String getValgtFilm() { return valgtFilm; }

        public void setValgtFilm(String valgtFilm) { this.valgtFilm = valgtFilm; }

    @Override
    public int compareTo(Billett billett) {
        return this.getEtternavn().compareTo(billett.getEtternavn());
    }
}
