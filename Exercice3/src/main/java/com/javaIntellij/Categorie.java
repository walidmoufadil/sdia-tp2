package com.javaIntellij;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Categorie {
    private long id;
    private String nom;
    private String description;
    private List<Ordinateur> ordinateurList;


    public Categorie() {
        this.ordinateurList = new ArrayList<>();
    }

    public Categorie(String nom, String description, List<Ordinateur> ordinateurList) {
        this.id = new Random().nextLong();
        this.nom = nom;
        this.description = description;
        this.ordinateurList = ordinateurList;
    }



    public void ajouterOrdinateur(Ordinateur ordinateur) {
        if( !ordinateurList.contains(ordinateur) )
            ordinateurList.add(ordinateur);
    }

    public void supprimerOrdinateur(Ordinateur ordinateur) {
        ordinateurList.remove(ordinateur);
    }

    public List<Ordinateur> rechercherOrdinateur(double prix) {
                return ordinateurList.stream().filter((ordinateur -> ordinateur.getPrix() == prix)).collect(Collectors.toList());
    }
}
