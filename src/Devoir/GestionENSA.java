package Devoir;



public class GestionENSA {
    public static void main(String[] args) {
        //Enseignant rr =new Enseignant(1,"1","1","PH",250);
        Enseignant E =new Enseignant(2,"2","2","PH",300);
        Etudiants e=new Etudiants(2,"2","2","PH",18.50);
        //RessourcesHumaines r =new RessourcesHumaines(2);
        Etudiants e1=new Etudiants(2,"2","2","PH",18.50);
        Etudiants e2=new Etudiants(2,"2","2","PH",18.50);

        E.Ajouter_etudiant(e1);
        E.Afficher_etd();
        E.Ajouter_etudiant(e);
       E.Afficher_etd();
    }
}
