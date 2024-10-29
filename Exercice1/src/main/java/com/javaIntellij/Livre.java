package com.javaIntellij;

import java.util.Random;

public class Livre {
    private long id;
    private long ISBN;
    private Auteur auteur;

    public Livre() {
    }

    public Livre(long ISBN, Auteur auteur) {
        Random rand = new Random();
        this.id = rand.nextLong();
        this.ISBN = ISBN;
        this.auteur = auteur;
    }
    public void afficher(){
        System.out.println("ISBN: " + ISBN);
        auteur.afficher();
    }
}
