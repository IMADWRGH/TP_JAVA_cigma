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
    public void Afficher()
    {
        System.out.println(" les informations d'etudiant :");
        System.out.println("Code "+this.code+" Nom "+this.nom+" Prenom "+this.prenom+" Niveau "+this.niveau+" moyenne Annuelle "+this.moyenneAnnuelle);
    }
}
