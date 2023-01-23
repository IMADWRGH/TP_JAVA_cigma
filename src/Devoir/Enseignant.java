package Devoir;

import java.util.*;

public class Enseignant extends Personnel{
private String Grade;
private int volume_horaire;
private List<Etudiants> ListE =new ArrayList<>();


    public Enseignant(int code, String nom, String prenom, String grade, int volume_horaire) {
        super(code, nom, prenom);
        Grade = grade;
        this.volume_horaire = volume_horaire;
    }
    public void Afficher()
    {
        System.out.println("les informatons de Enseignant");
        System.out.println("Code "+getCode()+" Nom "+getNom()+" Prenom "+getPrenom()+" Grade "+this.Grade+" Nombres de horaire qui travail "+this.volume_horaire);
    }

    @Override
    public double Calculer_Salaire(int heures, double coefficient) {
        return 0;
    }

}
