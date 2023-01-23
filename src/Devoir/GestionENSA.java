package Devoir;



public class GestionENSA {
    public static void main(String[] args) {
        Enseignant rr =new Enseignant(1,"1","1","PH",250);
        Enseignant E =new Enseignant(2,"2","2","PH",300);
        RessourcesHumaines r =new RessourcesHumaines(2);
 r.Ajouter(rr);
 r.Ajouter(E);
 r.Afficher_Enseignants();
    }
}
