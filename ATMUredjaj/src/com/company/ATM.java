package com.company;

public class ATM {

    protected double trenutnaRaspolozivost;
    private String verzijasoftvera = "2.00";

    public ATM() {
    }

    public ATM(double trenutnaRaspolozivost) {
        this.trenutnaRaspolozivost = trenutnaRaspolozivost;
    }

    public ATM(double trenutnaRaspolozivost, String verzijasoftvera) {
        this.trenutnaRaspolozivost = trenutnaRaspolozivost;
        this.verzijasoftvera = verzijasoftvera;
    }

    public void  isplatinovac(double novac, Korisnik k){
        if(trenutnaRaspolozivost > novac){
            trenutnaRaspolozivost -= novac;
            k.setStanje(k.getStanje() - novac );
        }
        else{
            System.out.println("Trenutn nema para u ovom ATM-u");
        }


    }

    @Override
    public String toString() {
        return "ATM{" +
                "trenutnaRaspolozivost=" + trenutnaRaspolozivost +
                '}';
    }
}
