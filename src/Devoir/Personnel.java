package Devoir;

public abstract class Personnel {
    private int code;
    private String nom;
    private String prenom;
    private int bureau;
    private double salaire;
    private  double prime;

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

    public int getBureau() {
        return bureau;
    }

    public void setBureau(int bureau) {
        this.bureau = bureau;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public Personnel(int code, String nom, String prenom, int bureau, double salaire, double prime) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        this.salaire = salaire;
        this.prime = prime;
    }

    public abstract double Calculer_Salaire();

    public void Afficher(){
        System.out.println("les informations personnelles :");
        System.out.print("Code  "+this.code+" Nom "+this.nom+" Prenom "+this.prenom+" Bureau "+this.bureau+" Salaire "+this.salaire+" Prime "+this.prime);
    }
}
