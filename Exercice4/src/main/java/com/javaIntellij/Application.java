package com.javaIntellij;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static Produit saisieProduit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir les infomation du produit");
        System.out.print("NOM : ");
        String nom = scanner.nextLine();

        System.out.print("MARQUE : ");
        String marque = scanner.nextLine();

        System.out.print("PRIX : ");
        double prix = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("DESCRIPTION : ");
        String description = scanner.nextLine();

        System.out.print("STOCK : ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        return new Produit(nom,marque,prix,description,stock);
    }

    public static void afficherProduit(Produit produit){

        System.out.println("NOM : "+ produit.getNom());
        System.out.println("MARQUE : "+ produit.getMarque());
        System.out.println("PRIX : "+ produit.getPrix());
        System.out.println("DESCRIPTION : "+ produit.getDescription());
        System.out.println("STOCK : "+ produit.getStock());
    }

    public static void Main(){

        IMetier fonctionnalite = new MetierProduitImpl(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);

        int choix = 0;
        while(choix != 6){

            System.out.println("-------------------------------------------MENU---------------------------------------------------");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher des produits par mot clé.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Récupérer et afficher un produit par ID.");
            System.out.println("5. Supprimer un produit par id.");
            System.out.println("6. Quitter ce programme.");

            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();


            switch (choix){
                case 1:
                    fonctionnalite.getAll().forEach(Application::afficherProduit);
                    break;
                case 2:
                    System.out.println("Veuillez saisir le mot clé");
                    String motCle = scanner.nextLine();
                    List<Produit> list = fonctionnalite.findByNom(motCle);
                    list.forEach(Application::afficherProduit);
                    break;
                case 3:
                    fonctionnalite.add(Application.saisieProduit());
                    break;
                case 4:

                    System.out.print("ID : ");
                    long id = scanner.nextLong();
                    scanner.nextLine();

                    Produit produit = fonctionnalite.findById(id);
                    Application.afficherProduit(produit);


                    break;
                case 5:
                    System.out.print("ID : ");
                    id = scanner.nextLong();
                    scanner.nextLine();

                    fonctionnalite.delete(id);
                    break;
                case 6:
                    System.out.println("Vous avez choisi de quitter le Menu");
                    break;
                default:
                    System.out.println("Veuillez saisir un choix valide.");
                    scanner.nextLine();

            }



        }

    }
}
