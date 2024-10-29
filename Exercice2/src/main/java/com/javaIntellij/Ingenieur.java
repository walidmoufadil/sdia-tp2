package com.javaIntellij;

public class Ingenieur extends Employe {
    private long id;
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite){
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.15 ;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                " specialite='" + specialite + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
