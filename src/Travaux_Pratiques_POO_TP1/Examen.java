/////////////////////Séance 2 de Java: Exercie 2 ///////////////////

package Travaux_Pratiques_POO_TP1;

public class Examen {
    private  int code;
    private  String duree;
    private String date;

    public void Afficher()
    {
        System.out.println(" { Code "+code+" Duree :"+duree+" Date  :"+date+" }");
    }
    public Examen() {
        this.code = 0;
        this.duree = "1H30";
        this.date = "00/00/0000";
    }
    public Examen(int code, String duree, String date) {
        this.code = code;
        this.duree = duree;
        this.date = date;
    }

    public static void main(String[] args) {
        Examen E1=new Examen();
        Examen E2 =new Examen(10,"2H10","24/05/2019");
        E1.Afficher();
        E2.Afficher();
    }
}
