package Devoir;

import java.util.*;

public class Enseignant extends Personnel{
private String Grade;
private int volume_horaire;
private int nbr_hs=0; // nbr_hs :nombre de heure supplementaire
private List<Etudiants> ListE =new ArrayList<Etudiants>();


    public int getNbr_hs() {
        return nbr_hs;
    }

    public void setNbr_hs(int nbr_hs) {
        this.nbr_hs = nbr_hs;
    }

    public Enseignant(int code, String nom, String prenom, String grade, int volume_horaire, int nbr_hs) {
        super(code, nom, prenom);
        Grade = grade;
        this.volume_horaire = volume_horaire;
        this.nbr_hs = nbr_hs;

    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public int getVolume_horaire() {
        return volume_horaire;
    }

    public void setVolume_horaire(int volume_horaire) {
        this.volume_horaire = volume_horaire;
    }

    public List<Etudiants> getListE() {
        return ListE;
    }

    public void setListE(List<Etudiants> listE) {
        ListE = listE;
    }

    public void Afficher()
    {
        System.out.println("les informatons de Enseignant : "+this.getCode());
        System.out.println("Code "+getCode()+" Nom "+getNom()+" Prenom "+getPrenom()+" Grade "+this.Grade+" Nombres de horaire qui travail "+this.volume_horaire+"Nombres de horaire pour travail supplementaire "+this.nbr_hs);
    }

    @Override
    public double Calculer_Salaire(double coefficient) {
        return this.volume_horaire*coefficient;
    }
    public void Ajouter_etudiant( Etudiants e)
    {
        for(int i=0;i<ListE.size() ;i++)
        {
            ListE.add(e);
        }
    }
    public void Afficher_etd()
    {

        for(Etudiants e : ListE )
        {
            System.out.println("--------------------");
            System.out.println("Code "+e.getCode()+" Nom "+e.getNom()+" Prenom "+e.getPrenom()+" Niveau "+e.getNiveau()+" moyenne Annuelle "+e.getMoyenneAnnuelle());

        }
    }
    public double  Salaire_supplementaire()
    {
        //: PA: 200 DH PH : 250 DH PES : 300 DH
        double result=0;
        switch(this.Grade)
        {
            case "PA": result=200*this.nbr_hs;
            case "PH": result=250*this.nbr_hs;
            case "PES" :result=300*this.nbr_hs;
            default :System.out.print("Les informations que vous avez saisies sont incorrectes  ");
        }
        return result;
    }
}
