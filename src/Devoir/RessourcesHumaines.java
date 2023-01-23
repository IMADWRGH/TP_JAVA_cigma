package Devoir;
import java.util.*;
public class RessourcesHumaines {
private int nbr_E;
private  List <Enseignant> GRH =new ArrayList<>();

    public RessourcesHumaines(int nbr_E) {
        this.nbr_E = nbr_E;
    }

    public void Ajouter (Enseignant e)
{
    for(int i=0;i<nbr_E-1;i++)
    {
        GRH.add(e);
    }

}
    public void Afficher_Enseignants()
{
    for(Enseignant e : GRH)
    {
        System.out.println("--------------------");
        System.out.println("Code "+e.getCode()+" Nom "+e.getNom()+" Prenom "+e.getPrenom()+" Grade "+e.getGrade()+" Nombres de horaire qui travail "+e.getVolume_horaire());
    }

}
   // Rechercher_Ens( ?)













}
