/////////////////////Séance 2 de Java: Exercie 4 ///////////////////

package Travaux_Pratiques_POO_TP1;

public class Enseignant {
    String code ;
    String nom ;
    String prenom ;
    int echolon;
    double nbr_heures;
    public static double [] taux_horaire=new double[] {200,210,220,230,280,300,310,320,330,350,380};

    public Enseignant(String code, String nom, String prenom, int echolon, double nbr_heures) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.echolon = echolon;
        this.nbr_heures = nbr_heures;
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getEcholon() {
        return echolon;
    }

    public double getNbr_heures() {
        return nbr_heures;
    }

    void Afficher()
    {
        System.out.print("Le code : "+getCode()+" Le nom : "+getNom()+" le Prenom : "+getPrenom()+" Echelon : "+getEcholon()+" Nombres D'heures : "+getNbr_heures()+" Salaire : "+Salaire());
    }

    public double Taux_horaire(int echolon)
    {
        return taux_horaire[echolon];
    }
    public boolean Echelon_valide()
    {
        return echolon >= 1 && echolon <= 11;

    }
    public double Salaire()
    {
        double salaire=0;
        if (!Echelon_valide()) {
                return salaire;
        }else {
            return nbr_heures*Taux_horaire(echolon-1);
        }
    }
    
}
