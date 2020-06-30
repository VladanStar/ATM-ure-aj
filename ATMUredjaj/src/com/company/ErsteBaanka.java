package com.company;

public class ErsteBaanka extends ATM{
    public ErsteBaanka() {
    }

    public ErsteBaanka(double trenutnaRaspolozivost) {
        super(trenutnaRaspolozivost);
    }

    @Override
    public void isplatinovac(double novac, Korisnik k) {
        if (trenutnaRaspolozivost > novac) {
            trenutnaRaspolozivost -= novac;
            k.setStanje(k.getStanje() - (novac * (novac * 0.02)));
        } else {
            System.out.println("trenutno nema para u ovom ATM-u");
        }
    }

    }

