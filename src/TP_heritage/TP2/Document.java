package TP_heritage.TP2;

public  abstract class Document {
    private int  reference;
    private String titre;

    public Document(int reference, String titre) {
        this.reference = reference;
        this.titre = titre;
    }

    public int getReference() {
        return reference;
    }


    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
public  void Afficher()
{
    System.out.println("Le reference  "+this.reference+" est le titre "+this.titre);
}

public void description()
{
System.out.println(" la fiche de bibliothèque ");
}







}
