package TP_heritage.TP1;

public class Carres extends Rectangles {
    public Carres(double cote) {
        super(cote,cote);
    }
    public void Afficher()
    {
        System.out.println("la surface de Carre  est : "+super.Surface());
        System.out.println(" Le perimetre de Carre est : "+super.Perimetre());
    }
}
