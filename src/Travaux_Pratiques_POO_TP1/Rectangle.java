package Travaux_Pratiques_POO_TP1;

public class Rectangle {
    private int longueur ;
    private int largeur;
    public void setLongLarg(int longueur,int largeur)
    {
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public int SurfaceRectangle()
    {
        return longueur*largeur;
    }

    public static void main(String[] args) {
        Rectangle R=new Rectangle();
        R.setLongLarg(10,10);
        System.out.print("la surface de rectangle est "+R.SurfaceRectangle()+" m²");
    }


}
