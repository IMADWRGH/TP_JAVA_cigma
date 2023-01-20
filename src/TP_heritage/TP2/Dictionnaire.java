package TP_heritage.TP2;

public class Dictionnaire  extends Document{
    private  int nbr_mots_def;

    public Dictionnaire(int reference, String titre, int nbr_mots_def) {
        super(reference, titre);
        this.nbr_mots_def = nbr_mots_def;
    }

    public int getNbr_mots_def() {
        return nbr_mots_def;
    }

    public void setNbr_mots_def(int nbr_mots_def) {
        this.nbr_mots_def = nbr_mots_def;
    }

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("le nombre de définitions de mots "+this.nbr_mots_def);
    }

    @Override
    public void description() {
        super.description();
        System.out.print(" d'un dictionnaire de numero "+super.getReference());
    }
}
