package com.javaIntellij;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Doe","John","johnDoe@gmail.com","001234567890",20,new Random().nextInt());
        Auteur auteur = new Auteur("Cartner","Maria","mariaCartner@gmail.com","001234567890",20,new Random().nextInt());
        Livre livre = new Livre( new Random().nextLong(),auteur);
        adherent.afficher();
        System.out.println();
        livre.afficher();
    }
}