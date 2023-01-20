package TP_heritage.TP2;

public class GestionBibliotheque {
    public static void main(String[] args) {
Biblio b=new Biblio(100);
Document d1=new Dictionnaire(1,"hell",420);
Document d2=new Dictionnaire(2,"jjjjjjjj",1500);
Document d3=new Dictionnaire(3,"hell",4213);
Document d4=new Dictionnaire(4,"hell",4214);
Document d5=new Livre(4,"hell","rrrrrrrr",420);
Document d6=new Livre(4,"hell","ddddddddd",420);
b.Ajouter(d1);
b.Ajouter(d2);
b.Ajouter(d3);
b.Ajouter(d4);
b.Ajouter(d5);
b.Ajouter(d6);
b.Afficher_Dictionnaire();
b.toutesLesDescriptions();




    }
}
