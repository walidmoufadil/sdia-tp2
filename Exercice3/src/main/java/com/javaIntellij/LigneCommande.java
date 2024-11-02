package com.javaIntellij;

import java.util.Random;

public class LigneCommande {
    private long id;
    private int quantite;
    private Commande commande;
    private Ordinateur ordinateur;

    public LigneCommande() {
    }

    public LigneCommande(int quantite, Commande commande, Ordinateur ordinateur) {
        this.id = new Random().nextLong();
        this.quantite = quantite;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", commande=" + commande.toString() +
                ", ordinateur=" + ordinateur.toString() +
                '}';
    }
}
