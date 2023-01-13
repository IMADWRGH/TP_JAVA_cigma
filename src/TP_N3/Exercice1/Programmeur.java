package TP_N3.Exercice1;

import java.util.Arrays;

public class Programmeur {
    private int id;
    private String nom;
    private String prenom;
    private int bureau;
    Consos_Cafe [] CC;
    private static int num_id=1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getBureau() {
        return bureau;
    }

    public void setBureau(int bureau) {
        this.bureau = bureau;
    }

    public Programmeur(int id, String nom, String prenom, int bureau) {
        this.id = num_id++;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        CC=new Consos_Cafe[10];
        for (int i=0;i<CC.length;i++)
        {
            CC[i]=new Consos_Cafe();
            CC[i].setNo_ssemaine(i+1);
            CC[i].setNr_tasses(0);
        }
    }
    public void Afficher ()
    {
        System.out.println("ID : "+this.id+" Nom :"+this.nom+" Prenom :"+this.prenom+" Bureau : "+this.bureau);
        System.out.println("le nombre de tasses de café consommées par semaine  :");
        for (int i=0 ;i<CC.length;i++)
        {
            System.out.println("Semain "+CC[i].getNo_ssemaine()+": "+CC[i].getNr_tasses()+" tasse.");
        }
    }


}

