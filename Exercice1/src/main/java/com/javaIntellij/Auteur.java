package com.javaIntellij;

public class Auteur extends Personne{
    private long id;
    private int numAuteur;

    public Auteur() {
    }

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom,prenom,email,tel,age);
        this.numAuteur = numAuteur;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("numAuteur = "+numAuteur);
    }
}
