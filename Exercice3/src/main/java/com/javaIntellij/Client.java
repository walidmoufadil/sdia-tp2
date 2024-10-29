package com.javaIntellij;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String ville;
    private String telephone;
    private List<Commande> commandes = new ArrayList<>();

    public Client() {

    }

    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone) {
        this.id = new Random().nextLong();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getVille() {
        return ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void ajouterCommande(Commande commande) {
        if(!commandes.contains(commande))
            commandes.add(commande);
    }
    public void supprimerCommande(Commande commande) {

        commandes.remove(commande);
    }
}
