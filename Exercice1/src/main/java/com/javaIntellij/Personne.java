package com.javaIntellij;

import java.util.Random;

public class Personne {
    protected long id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String tel;
    protected int age;

    public Personne() {
    }

    public Personne(String nom, String prenom, String email, String tel, int age) {
        Random rand = new Random();
        this.id = rand.nextLong();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }
    public void afficher(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Tel: " + tel);
        System.out.println("Age: " + age);
    }

}
