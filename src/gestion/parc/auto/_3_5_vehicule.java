package gestion.parc.auto;


public class _3_5_vehicule {
    private String matricule;
    private String carburant;
    private String kilo;
    private String modele;
    private String seuil;
    private String vidange;
    private String marque;
    
    public _3_5_vehicule(String matricule,String carburant,String kilo,String modele,String seuil,String vidange,String marque){
        this.matricule=matricule;
        this.carburant=carburant;
        this.kilo=kilo;
        this.modele=modele;
        this.seuil=seuil;
        this.vidange=vidange;
        this.marque=marque;
    }
    public String getMatricule(){return matricule;}
    public String getCar(){return carburant;}
    public String getKilo(){return kilo;}
    public String getMod(){return modele;}
    public String getSeuil(){return seuil;}
    public String getVid(){return vidange;}
    public String getMarque(){return marque;}
    
    public void setMatricule(String matr){this.matricule=matr;}
    public void setCar(String car){this.carburant=car;}
    public void setKilo(String kilo){this.kilo=kilo;}
    public void setMod(String mod){this.modele=mod;}
    public void setSeuil(String seuil){this.seuil=seuil;}
    public void setVid(String vid){this.vidange=vid;}
    public void setMarque(String marque){this.marque=marque;}
}
