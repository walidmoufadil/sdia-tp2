package com.javaIntellij;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Categorie {
    private long id;
    private String nom;
    private String description;
    private List<Ordinateur> ordinateurList = new ArrayList<>();


    public Categorie() {
    }

    public Categorie(String nom, String description) {
        this.id = new Random().nextLong();
        this.nom = nom;
        this.description = description;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ordinateur> getOrdinateurList() {
        return ordinateurList;
    }

    public void setOrdinateurList(List<Ordinateur> ordinateurList) {
        this.ordinateurList = ordinateurList;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", ordinateurList=" + ordinateurList.toString() +
                '}';
    }
}
