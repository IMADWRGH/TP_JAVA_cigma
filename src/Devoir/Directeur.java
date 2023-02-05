package Devoir;

public class Directeur extends Personnel{
    private static Directeur directeur;
    private Directeur(int code, String nom, String prenom, int bureau, double salaire,double prime) {
        super(code, nom, prenom,bureau,salaire,prime);
    }

    public static Directeur getInstance(int code, String nom, String prenom, int bureau, double salaire,double prime){
        if (directeur==null)
        {
            directeur=new Directeur(code, nom, prenom,bureau,salaire,prime);
        }else {
             System.out.println("C'est déjà créé impossible de recréer");
        }
        return directeur;
    }
    @Override
    public double Calculer_Salaire() {
        return getSalaire()+getPrime();
    }
}
