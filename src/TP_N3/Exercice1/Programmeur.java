package TP_N3;

public class Programmeur {
    private int id;
    private String nom;
    private String prenom;
    private int bureau;

    public Programmeur(int id, String nom, String prenom, int bureau) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }
    public void Affichre ()
    {
        System.out.print("ID est "+this.id+" Nom "+this.nom+" Prenom"+this.prenom+" Bureau "+this.bureau);
    }
    public int  Change_Bureau ( int  bureau)
    {
       return this.bureau=bureau;
    }
    public static void main(String[] args) {
        Programmeur p=new Programmeur(1,"travis","ss",22);
        p.Affichre();
    }

}

