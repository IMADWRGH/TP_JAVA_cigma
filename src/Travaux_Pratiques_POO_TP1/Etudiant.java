/////////////////////Séance 2 de Java: Exercie 3 ///////////////////

package Travaux_Pratiques_POO_TP1;
import java.util.Scanner;
public class Etudiant {
  private int numero;
  private String nomPrenom;
  private double []notes;

  public Etudiant(int numero,String nomPrenom)
  {
      this.numero=numero;
      this.nomPrenom=nomPrenom;
      notes=new double[10];
      for (int i=0;i<10;i++)
          notes[i]=10;
  }
  private double NoteMax()
  {
      double max;
      max=notes[0];
      for (int i=1;i<10;i++)
      {
          if (notes[i]>max)
              max=notes[i];
      }
      return max;
  }

  public void Affiche()
  {
      System.out.println("Numero : "+numero);
      System.out.println("Non complet : "+nomPrenom);
      System.out.print("les notes : ");
      for (int i=0 ;i<10;i++) {
          System.out.print(notes[i] + " ");
      }
      System.out.println();
      System.out.println("La note max : "+NoteMax());
  }

public void Saisi()
{
    Scanner Saisi=new Scanner(System.in);
    for (int i=0;i<10;i++) {
        try {
            if (notes[i]>=0 && notes[i]<=20) {
                System.out.print("la note " + (i + 1) + " :");
                notes[i] = Saisi.nextDouble();
            }
        }catch (Exception ex){
            System.out.print("Error");
        }
    }
}

    public static void main(String[] args) {
        Etudiant e=new Etudiant(1,"imad");
        e.Saisi();
        e.Affiche();
    }
}
