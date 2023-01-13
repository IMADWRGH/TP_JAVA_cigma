package TP_N3.Exercice2;

public class Fichier {
    private String nom;
    private String extension;
    private float taille;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public Fichier(String nom, String extension, float taille) {
        this.nom = nom;
        this.extension = extension;
        this.taille = taille;
    }
    public void Affiche()
    {
        System.out.println("Le nom de fixhier : "+this.nom+"."+this.extension+" "+this.taille+" KO");
    }
}