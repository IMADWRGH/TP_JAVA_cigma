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
    public int Supprimer(String nom)
    {
        int result=Rechercher(nom);
        if (result==1)
            for (int i=0;i<this.nbr_fichiers;i++)
            {
                ref_file[i]=ref_file[i+1];
                this.nbr_fichiers--;
                return 1;
            }
        return 0;
    }

    public void Renommer(String newNom,String oldNom)
    {
        int result=Rechercher(oldNom);
        if (result==1)
         ref_file[result].setNom(newNom);
        else
            System.out.println("Le fichier "+oldNom+" n'est existe pas");
    }

    public int Modifier(String nom,float taille)
    {
        int result=Rechercher(nom);
        if (result==1) {
            ref_file[result].setTaille(taille);
            return 1;
        }
        else {
            System.out.println("Le fichier " + nom + " n'est existe pas");
            return -1;
        }
    }
    public float getTaille() {
        float tailleMo = 0;
        for (int i = 0; i < this.nbr_fichiers; i++) {
            tailleMo = ref_file[i].getTaille() / 1024;
        }
        return tailleMo;
    }
}
