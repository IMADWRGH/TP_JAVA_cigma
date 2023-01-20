package TP_N3.Exercice1;

public class Consos_Cafe {
    private int no_semaine;
    private int nr_tasses;
    Programmeur[] Pr;
    public int getNo_ssemaine() {
        return no_semaine;
    }
    public void setNo_ssemaine(int no_ssemaine) {
        this.no_semaine = no_ssemaine;
    }

    public int getNr_tasses() {
        return nr_tasses;
    }
    public void setNr_tasses(int nr_tasses) {
        this.nr_tasses = nr_tasses;
    }

    public Consos_Cafe() {}

    public void Afficher ()
    {
        System.out.print("Numero de semaine : "+this.no_semaine+" Nombres des tasses : "+this.nr_tasses);
    }


}
