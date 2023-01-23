package Devoir;

public class Administratif extends Personnel{

    public Administratif(int code, String nom, String prenom) {
        super(code, nom, prenom);
    }

    @Override
    public double Calculer_Salaire(double coefficient) {
        return 0;
    }
}
