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

    public String getReference() {
        return reference;
    }

    public LocalDate getDate() {
        return date;
    }

    public Etat getEtat() {
        return etat;
    }

    public Client getClient() {
        return client;
    }
}
