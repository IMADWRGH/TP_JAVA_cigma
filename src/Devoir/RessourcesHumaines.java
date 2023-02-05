package Devoir;
import java.util.*;
public class RessourcesHumaines {
private int nbr_E;
private  List <Enseignant> GRH;

    public RessourcesHumaines(int nbr_E) {
        this.nbr_E = nbr_E;
        this.GRH= new ArrayList<>();
    }

    public void Afficher_Enseignants()
{
    for(Enseignant e : GRH)
    {
        e.Afficher();
    }

}
//   public int  Rechercher_Ens(int code )
//   {
//
//       for (Enseignant e :GRH)
//           if (e.getCode() == code)
//               return GRH.indexOf(e);
//   }
    public int Rechercher_Ens(int code ) {
        int result = 0;
        for (Enseignant e : GRH)
            if (e.getCode()==code)
                return result=GRH.indexOf(e);
       return result;
    }

  public void Ajouter_groupe(Enseignant e)
  {
      for (int i=0;i<nbr_E;i++)
      {
          GRH.add(e);
      }
  }












}
