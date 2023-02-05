package Devoir;

import java.util.*;

public class Enseignant extends Personnel{
private String Grade;
private int volume_horaire;
private Map<String,List<Etudiants>> Groupes;
    public Enseignant(int code, String nom, String prenom, int bureau, double salaire, double prime, String grade, int volume_horaire) {
        super(code, nom, prenom, bureau, salaire, prime);
        this.Grade = grade;
        this.volume_horaire = volume_horaire;
        this.Groupes = new Hashtable<>();
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

    public Map<String, List<Etudiants>> getGroupes() {
        return Groupes;
    }

    public void setGroupes(Map<String, List<Etudiants>> groupes) {
        Groupes = groupes;
    }

    public void Afficher()
    {
        System.out.println("les informatons de Enseignant : ");
        super.Afficher();
        System.out.println(" Grade "+this.Grade+" Nombres de horaire qui travail "+this.volume_horaire);
        System.out.println("Enseignant encadre les groupes: ");
        Iterator<String> key=Groupes.keySet().iterator();
        Iterator<List<Etudiants>> value=Groupes.values().iterator();
        Iterator<Etudiants> Liste_Etd;
        while (key.hasNext())
        {
            System.out.println(" Groupe : "+key.next());
            Liste_Etd=value.next().iterator();
            while (Liste_Etd.hasNext())
            {
                System.out.println(" Les Etudiants  de group: ");
                Liste_Etd.next().Afficher();
            }
            System.out.println("----------------------------------------------");
        }
//        for (String key :Groupes.keySet())
//        {
//            System.out.println(" Groupe : "+key);
//            for (List<Etudiants> values :Groupes.values() )
//            {
//                System.out.println("Les Etudiants  de group : ");
//            }
//        }


    }

    @Override
    public double Calculer_Salaire() {
        return  getSalaire()+getPrime()+Salaire_supplementaire();
    }
//

    public double  Salaire_supplementaire()
    {
        //: PA: 200 DH PH : 250 DH PES : 300 DH
        double result=0.0;
        switch(this.Grade)
        {
            case "PA": result=200*this.volume_horaire;
            case "PH": result=250*this.volume_horaire;
            case "PES" :result=300*this.volume_horaire;
            default : result=0.0;
        }
        return result;
    }
    public void Ajouter (Groupe g)
    {
        Groupes.put(g.getNomGroupe(),g.getListEtudiant());
    }

}
