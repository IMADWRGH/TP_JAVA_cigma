package Devoir;



public class GestionENSA {
    public static void main(String[] args) {
        Enseignant e1 =new Enseignant(1,"1","1","P",250,10);
        Enseignant e2 =new Enseignant(2,"2","2","PH",300,14);
        Enseignant e3=new Enseignant(3,"2","2","PH",18,12);
        RessourcesHumaines r =new RessourcesHumaines(2);
        Enseignant e4=new Enseignant(4,"2","2","PH",1850,18);
        Enseignant e5=new Enseignant(5,"2","2","PH",1851,0);
        Etudiants E1=new Etudiants(1,"imad1","asserne","1",18.75);
        Etudiants E2=new Etudiants(2,"imad2","asserne","1",18.75);
        Etudiants E3=new Etudiants(3,"imad3","asserne","1",18.75);
        Etudiants E4=new Etudiants(4,"imad4","asserne","1",18.75);
        Etudiants E5=new Etudiants(5,"imad5","asserne","1",18.75);
        e1.Ajouter_etudiant(E1);
        e1.Ajouter_etudiant(E2);
        e1.Ajouter_etudiant(E3);
        e1.Ajouter_etudiant(E4);
        e1.Ajouter_etudiant(E5);
       e1.Afficher_etd();
       r.Ajouter_groupe(e1);
      System.out.println( r.Rechercher_Ens(e2));



    }
}
