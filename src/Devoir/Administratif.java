package Devoir;

public class Administratif extends Personnel{


    public Administratif(int code, String nom, String prenom, int bureau, double salaire, double prime) {
        super(code, nom, prenom, bureau, salaire, prime);
    }

    @Override
    public double Calculer_Salaire(double coefficient) {
        return coefficient* super.getSalaire();
    }
    public void Afficher(){
        System.out.println("les informatons de Administratif : "+super.getCode());
        System.out.println("Code "+getCode()+" Nom "+getNom()+" Prenom "+getPrenom()+"Bureau "+getBureau()+"Salaire "+getSalaire()+"Prime "+getPrime());
    }
}
