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

}
