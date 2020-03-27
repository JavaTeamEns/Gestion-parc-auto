package gestion.parc.auto;


public class _3_4_mission {
    private static int id = 0;
    private String cond;
    private String matricule;
    private String localA;
    private String localD;
    private String dateA;
    private String dateD;
    
    public _3_4_mission(String cond,String matricule,String localA,String localD,String dateA,String dateD){
        this.id++;
        this.cond = cond;
        this.matricule = matricule;
        this.localA = localA;
        this.localD = localD;
        this.dateD = dateD;
        this.dateA = dateA;
    }
    
    public int getId(){return id;}
    public String getCond(){return cond;}
    public String getMatricule(){return matricule;}
    public String getLocalA(){return localA;}
    public String getLocalD(){return localD;}
    public String getDateD(){return dateD;}
    public String getDateA(){return dateA;}
    
    public void setId(int id){this.id=id;}
    public void setCond(String cond){this.cond=cond;}
    public void setMatricule(String matr){this.matricule=matr;}
    public void setLocalD(String localD){this.localD=localD;}
    public void setLocalA(String LocalA){this.localA=LocalA;}
    public void setDateD(String dateD){this.dateD=dateD;}
    public void setDateA(String dateA){this.dateA=dateA;}
}
