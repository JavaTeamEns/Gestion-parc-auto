/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.parc.auto;

public class _3_2_souche {
    private static int id;
    private String matricule;
    private String conducteur;
    private String ville;
    private double quantite;
    private double prix;

    public _3_2_souche(String matricule, String conducteur, String ville, double quantite, double prix) {
        this.matricule = matricule;
        this.conducteur = conducteur;
        this.ville = ville;
        this.quantite = quantite;
        this.prix = prix;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        _3_2_souche.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getConducteur() {
        return conducteur;
    }

    public void setConducteur(String conducteur) {
        this.conducteur = conducteur;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    
}
