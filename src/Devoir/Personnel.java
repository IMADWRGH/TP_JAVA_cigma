package Devoir;

public abstract class Personnel {
    private int code;
    private String nom;
    private String prenom;

    public Personnel(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }
    public abstract double Calculer_Salaire(int heures, double coefficient);
}
