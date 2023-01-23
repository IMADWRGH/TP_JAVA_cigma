package Devoir;

public class Etudiants {
    private int code;
    private String nom;
    private String prenom;
    private String niveau;
    private double moyenneAnnuelle;

    public Etudiants(int code, String nom, String prenom, String niveau, double moyenneAnnuelle) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.niveau = niveau;
        this.moyenneAnnuelle = moyenneAnnuelle;
    }

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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public double getMoyenneAnnuelle() {
        return moyenneAnnuelle;
    }

    public void setMoyenneAnnuelle(double moyenneAnnuelle) {
        this.moyenneAnnuelle = moyenneAnnuelle;
    }

    public void Afficher()
    {
        System.out.println(" les informations d'etudiant :");
        System.out.println("Code "+this.code+" Nom "+this.nom+" Prenom "+this.prenom+" Niveau "+this.niveau+" moyenne Annuelle "+this.moyenneAnnuelle);
    }
}
