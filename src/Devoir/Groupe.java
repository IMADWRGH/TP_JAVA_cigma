package Devoir;

import java.util.*;

public class Groupe {

    private String nomGroupe;
    private List<Etudiants> ListEtudiant;

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
        ListEtudiant =new ArrayList<>();
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public List<Etudiants> getListEtudiant() {
        return ListEtudiant;
    }

    public void setListEtudiant(List<Etudiants> listEtudiant) {
        ListEtudiant = listEtudiant;
    }

    public void Ajouter(Etudiants e){
        ListEtudiant.add(e);
    }
    public void Afficher(int code){
        for (Etudiants e: ListEtudiant){
            if (e.getCode()==code){
                e.Afficher();
            }
        }
    }
    public void Afficher(){
        System.out.println("les étudiants de groupe : "+this.nomGroupe);
        for (Etudiants e :ListEtudiant)
            e.Afficher();
    }
}
