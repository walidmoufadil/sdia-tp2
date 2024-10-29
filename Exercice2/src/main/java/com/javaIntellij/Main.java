package com.javaIntellij;

public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("John", "Doe","johnDoe@gmail.com","001234567890",10000,"Developpeur front-end");
        Manager manager = new Manager("Maria","Cartner","mariaCartner@gmail.com","001234567890",20000,"clientele");
        System.out.println(ingenieur.toString());
        System.out.println(manager.toString());
    }
}
