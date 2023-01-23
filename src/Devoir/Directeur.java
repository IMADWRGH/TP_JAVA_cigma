package Devoir;

public class Directeur extends Personnel{
  private Directeur(int code, String nom, String prenom) {
        super(code, nom, prenom);
    }

    @Override
    public double Calculer_Salaire(double coefficient) {
        return 0;
    }
}
