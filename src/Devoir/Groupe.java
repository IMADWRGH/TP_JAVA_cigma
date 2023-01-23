package Devoir;

import java.util.*;

public class Groupe {

    private String nomGroupe;
    private List<Etudiants> ListEtudiant=new ArrayList<>();
    private Map<String, List<Etudiants>> MapE=new HashMap<>();

    public Groupe(String nomGroupe, List<Etudiants> listEtudiant, Map<String, List<Etudiants>> mapE) {
        this.nomGroupe = nomGroupe;
        ListEtudiant = listEtudiant;
        MapE = mapE;
    }
}
