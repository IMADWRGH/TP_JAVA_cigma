/////////////////////Séance 2 de Java: Exercie 1 ///////////////////
package Travaux_Pratiques_POO_TP1;

public class Rectangle {
    private int longueur ;
    private int largeur;
    public void setLongLarg(int longueur,int largeur)
    {
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public int Surface()
    {
        return longueur*largeur;
    }
    public  int Perimetre(){return( longueur+largeur )*2 ;}
    void Afficher()
    {
        System.out.println("la surface de rectangle est "+Surface()+" m²");
        System.out.println("la Perimetre de rectangle est "+Perimetre()+" m²");
    }
    public static void main(String[] args) {
        Rectangle R=new Rectangle();
        R.setLongLarg(10,10);
        R.Afficher();

    }


}
