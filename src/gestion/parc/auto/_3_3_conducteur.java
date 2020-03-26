/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.parc.auto;
/**
 *
 * @author len
 */
public class _3_3_conducteur {
    
    private static int id=0;
    private String nom;
    private String prenom;
    private String tel;
    private String date;
    
    public _3_3_conducteur(String nom,String prenom,String tel,String date){
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.date=date;
        id++;
    }
    public int getId(){return id;}
    public String getNom(){return nom;}
    public String getPrennom(){return prenom;}
    public String getTel(){return tel;}
    public String getDate(){return date;}
    
    public void setId(int id){this.id=id;}
    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setTel(String tel){this.tel=tel;}
    public void setDate(String date){this.date=date;}
}
