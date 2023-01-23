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
    for(int i=0;i<GRH.size();i++)
    {
        GRH.get(i).Afficher();
    }

}
   // Rechercher_Ens( ?)













}
