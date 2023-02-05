package Devoir;


import java.util.*;

public class GestionENSA {
    public static void main(String[] args) {
       Directeur directeur = Directeur.getInstance(14,"fff","ff",14,150000,10);
       directeur.Afficher();
        Directeur directeur1 = Directeur.getInstance(15,"fff","ff",14,150000,10);
        Enseignant e =new Enseignant(1,"imad","asserne",1,150000,140,"PH",147);
        Groupe g=new Groupe("MIPC");
        g.Ajouter(new Etudiants(1,"travis","travis","1",18.75));
        e.Ajouter(g);
        e.Afficher();



    }
}
