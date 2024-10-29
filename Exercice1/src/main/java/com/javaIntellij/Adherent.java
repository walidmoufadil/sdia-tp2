package com.javaIntellij;

import java.util.Random;

public class Adherent extends Personne{
    long id;
    int numAdherent;

    public Adherent() {
    }

    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("NumAdherent: " + numAdherent);
    }
}
