package TP_heritage.TP2;

public class Livre  extends Document{
    private String auteur;
    private int nbr_pages;

    public Livre(int reference, String titre, String auteur, int nbr_pages) {
        super(reference, titre);
        this.auteur = auteur;
        this.nbr_pages = nbr_pages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbr_pages() {
        return nbr_pages;
    }

    public void setNbr_pages(int nbr_pages) {
        this.nbr_pages = nbr_pages;
    }

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Le auteur est : "+this.auteur+" est le nombre de pages "+this.nbr_pages);
    }

    @Override
    public void description() {
        super.description();
        System.out.print(" d'un livre de numero "+super.getReference());
    }
}


