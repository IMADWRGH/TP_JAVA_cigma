package TP_N3;

public class Consos_Cafe {
    private int no_ssemaine;
    private int programmeur;
    private int nr_tasses;

    public Consos_Cafe(int no_ssemaine, int programmeur, int nr_tasses) {
        this.no_ssemaine = no_ssemaine;
        this.programmeur = programmeur;
        this.nr_tasses = nr_tasses;
    }
    public void Afficher ()
    {
        System.out.print("Numero de semaine : "+this.no_ssemaine+" Id programmeur : "+this.programmeur+" Nombres des tasses : "+this.nr_tasses);
    }

    public static void main(String[] args) {
        Consos_Cafe c =new Consos_Cafe(1,22,20);
        c.Afficher();
    }
}
