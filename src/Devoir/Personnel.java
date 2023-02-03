package Devoir;

public abstract class Personnel {
    private int code;
    private String nom;
    private String prenom;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personnel(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }
    public abstract double Calculer_Salaire(double coefficient);

    public void Afficher(){
        System.out.println("les informations personnelles :");
        System.out.print("Code :"+this.code+"Nom"+this.nom+"Prenom"+this.prenom);
    }
}
