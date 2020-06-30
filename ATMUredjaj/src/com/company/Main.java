package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankaIntesa bi = new BankaIntesa(2000);
        Korisnik k = new Korisnik("256",20000);
        ErsteBaanka eb = new ErsteBaanka(58900);
        System.out.println(eb.trenutnaRaspolozivost);
        System.out.println(bi.trenutnaRaspolozivost);
        System.out.println(eb.toString());
        System.out.println(bi.toString());
    }
}
