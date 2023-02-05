package Devoir;


import java.util.*;

public class GestionENSA {
    public static void main(String[] args) {
//       Directeur directeur = Directeur.getInstance(14,"fff","ff",14,150000,10);
//       directeur.Afficher();
//        Directeur directeur1 = Directeur.getInstance(15,"fff","ff",14,150000,10);
       Enseignant e =new Enseignant(0,"imad","asserne",1,150000,140,"PH",147);
       Enseignant e1 =new Enseignant(1,"imad","asserne",1,150000,140,"PH",147);
       Enseignant e2 =new Enseignant(2,"imad","asserne",1,150000,140,"PH",147);
//        Groupe g=new Groupe("MIPC"); Groupe g1=new Groupe("MIP");
//        g.Ajouter(new Etudiants(1,"travis","travis","1",18.75));
//        g1.Ajouter(new Etudiants(2,"travis","travis","1",18.75));
//        g1.Ajouter(new Etudiants(3,"travis","travis","1",18.75));
//        e.Ajouter(g);
//        e.Ajouter(g1);
//       e.Afficher();
        RessourcesHumaines r =new RessourcesHumaines(1);
        r.Ajouter_groupe(e);
        System.out.println(r.Rechercher_Ens(2));
        //r.Afficher_Enseignants();




    }
}
