package com.company;

public class Korisnik {

    private String idKorisnika;
    private double stanje;

    public Korisnik() {
    }

    public Korisnik(String idKorisnika, double stanje) {
        this.idKorisnika = idKorisnika;
        this.stanje = stanje;
    }

    public String getIdKorisnika() {
        return idKorisnika;
    }

    public void setIdKorisnika(String idKorisnika) {
        this.idKorisnika = idKorisnika;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "idKorisnika='" + idKorisnika + '\'' +
                ", stanje=" + stanje +
                '}';
    }
}
