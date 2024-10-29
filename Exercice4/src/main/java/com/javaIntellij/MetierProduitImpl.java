package com.javaIntellij;

import java.util.List;
import java.util.stream.Collectors;

public class MetierProduitImpl implements IMetier{

    List<Produit> listProduit;

    public MetierProduitImpl(List<Produit> listProduit) {
        this.listProduit = listProduit;
    }

    @Override
    public Produit add(Produit p) {
         listProduit.add(p);
         return p;
    }

    @Override
    public List<Produit> getAll() {
        return listProduit;
    }

    @Override
    public List<Produit> findByNom(String motCle) {
        return listProduit.stream().filter(p -> p.getNom().contains(motCle)).collect(Collectors.toList());
    }

    @Override
    public Produit findById(long id) {
        return listProduit.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void delete(long id) {
        listProduit.removeIf(p -> p.getId() == id);
    }
}
