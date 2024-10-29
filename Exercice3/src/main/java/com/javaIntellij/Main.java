package com.javaIntellij;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ordinateur ordinateur1 = new Ordinateur("pro book","hp",4000,"c est un bon pc",100);
        Ordinateur ordinateur2 = new Ordinateur("elite book","hp",4500,"c est un bon pc",100);
        Ordinateur ordinateur3 = new Ordinateur("pro book","hp",4000,"c est un bon pc",100);
        List<Ordinateur> ordinateurs = new ArrayList<>();
        ordinateurs.add(ordinateur1);
        ordinateurs.add(ordinateur2);
        ordinateurs.add(ordinateur3);

        Categorie categorie = new Categorie("pc portable","c'est maniable",ordinateurs);

        Client client = new Client("Doe","John","paris avenue","johnDoe@gmail.com","Paris","001234567890");

        Commande commande = new Commande("XYZ",client, LocalDate.now(),Etat.MOYENNE);

        LigneCommande ligne1 = new LigneCommande(5,commande,ordinateur1);
        LigneCommande ligne2 = new LigneCommande(6,commande,ordinateur2);
        LigneCommande ligne3 = new LigneCommande(7,commande,ordinateur3);
        List<LigneCommande> ligneCommandes = new ArrayList<>();
        ligneCommandes.add(ligne1);
        ligneCommandes.add(ligne2);
        ligneCommandes.add(ligne3);

        System.out.println("Reference : "+commande.getReference());
        System.out.println("Date : "+commande.getDate());
        System.out.println("Etat : "+commande.getEtat());
        System.out.println("Client : "+commande.getClient().getNom());

    }
}