package com.javaIntellij;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Doe","John","johnDoe@gmail.com","001234567890",20,new Random().nextInt(Integer.MAX_VALUE));
        Auteur auteur = new Auteur("Cartner","Maria","mariaCartner@gmail.com","001234567890",20,new Random().nextInt(Integer.MAX_VALUE));
        Livre livre = new Livre( new Random().nextLong(),auteur);
        adherent.afficher();
        System.out.println();
        livre.afficher();
    }
}