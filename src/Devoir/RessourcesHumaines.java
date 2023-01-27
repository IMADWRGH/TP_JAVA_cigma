package Devoir;
import java.util.*;
public class RessourcesHumaines {
private int nbr_E;
private  List <Enseignant> GRH =new ArrayList<>();

    public RessourcesHumaines(int nbr_E) {
        this.nbr_E = nbr_E;
    }

    public void Afficher_Enseignants()
{
    for(Enseignant e : GRH)
    {
        e.Afficher();
    }

}
   public int  Rechercher_Ens(Enseignant e )
   {
               return GRH.indexOf(e);

   }

  public void Ajouter_groupe(Enseignant e)
  {
      for (int i=0;i<nbr_E;i++)
      {
          GRH.add(e);
      }
  }












}
