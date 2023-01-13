package TP_N3.Exercice2;

public class Repertoire {
    private String nom;
    private int nbr_fichiers;
    private Fichier [] ref_file;

    public Repertoire(String nom) {
        this.nom = nom;
    }

    public void Afficher ()
    {
        System.out.println("Le nom du repertoire :"+this.nom);
        for(int i=0;i<this.nbr_fichiers;i++){
            ref_file[i].Affiche();
        }
    }
    public void Ajouter(Fichier fichier)
    {
        if (this.nbr_fichiers<30)
        {
            ref_file[this.nbr_fichiers++]=fichier;
        }
        System.out.println("Error");
    }
    public int  Rechercher(String nom)
    {
        for (int i=0;i<this.nbr_fichiers;i++)
            if (ref_file[i].getNom().equals(nom))
                return i;
        return -1;
    }
    public void Rechercher()
    {
        for (int i=0;i<this.nbr_fichiers;i++)
            if (ref_file[i].getExtension().equals("pdf"))
                ref_file[i].Affiche();

    }
}
