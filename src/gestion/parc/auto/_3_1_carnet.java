/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.parc.auto;

public class _3_1_carnet {
    private static int id;
    private String mtricule;
    private int debut_serie;
    private int fin_serie;

    public _3_1_carnet(String mtricule, int debut_serie, int fin_serie) {
        this.mtricule = mtricule;
        this.debut_serie = debut_serie;
        this.fin_serie = fin_serie;
        id++;
    }

    public  int getId() {
        return id;
    }


    public String getMtricule() {
        return mtricule;
    }

    public void setMtricule(String mtricule) {
        this.mtricule = mtricule;
    }

    public int getDebut_serie() {
        return debut_serie;
    }

    public void setDebut_serie(int debut_serie) {
        this.debut_serie = debut_serie;
    }

    public int getFin_serie() {
        return fin_serie;
    }

    public void setFin_serie(int fin_serie) {
        this.fin_serie = fin_serie;
    }
    public void setID(int id) {
        this.id = id;
    }
    
    
    
}
