package com.javaIntellij;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Commande {
    private long id;
    private String reference;
    private LocalDate date;
    private Etat etat;
    private Client client;

    public Commande() {
    }

    public Commande(String reference, Client client, LocalDate date, Etat etat) {
        this.id = new Random().nextLong();
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etat = etat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", date=" + date +
                ", etat=" + etat +
                ", client=" + client.getNom() + " " + client.getPrenom() +
                '}';
    }
}
