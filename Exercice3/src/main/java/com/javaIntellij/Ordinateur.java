package com.javaIntellij;

import java.util.Random;

public class Ordinateur {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int stock;

    public Ordinateur() {
    }

    public Ordinateur(String nom, String marque, double prix, String description, int stock) {
        this.id = new Random().nextLong();
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.stock = stock;
    }


    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }
}
