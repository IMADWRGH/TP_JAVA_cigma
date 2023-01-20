package TP_heritage.TP1;

public class Rectangles {
    private double longueur;
    private double largeur;


    public   double Surface ()
    {
        return this.largeur*this.longueur;
    }
    public double Perimetre()
    {
        return (this.largeur+this.longueur)*2;
    }

    public Rectangles(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void Afficher()
    {
        System.out.println("la surface de Rectangle est : "+Surface());
        System.out.println(" Le perimetre de Rectangle est : "+Perimetre());
    }
}
