package com.company;

public class BankaIntesa extends ATM{
    public BankaIntesa() {
    }

    public BankaIntesa(double trenutnaRaspolozivost) {
        super(trenutnaRaspolozivost);
    }

    @Override
    public void isplatinovac(double novac, Korisnik k) {
        if (trenutnaRaspolozivost > novac) {
            trenutnaRaspolozivost -= novac;
            k.setStanje(k.getStanje() - (novac * (novac * 0.05)));
        } else {
            System.out.println("trenutno nema para u ovom ATM-u");
        }
    }
}
