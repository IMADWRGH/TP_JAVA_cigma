package TP_N3.Exercice1;

public class Projet {
    private String code ;
    private String sujet;
    private int duree;
    private int nbr_pr;
    private Programmeur[] Pr=new Programmeur[10];

    public Projet(String code, String sujet, int duree) {
        this.code = code;
        this.sujet = sujet;
        this.duree = duree;
        this.nbr_pr=0;
        Programmeur.semaine=this.duree;
    }
    public void Ajouter(Programmeur Pr)
    {
        if (nbr_pr<10)
           this.Pr[nbr_pr++]=Pr;
        else
            System.out.println("espace insuffisant");
    }

    public int Rechercher(int id)
    {
        for (int i=0;i<nbr_pr;i++)
            if (Pr[i].getId()==id)
                return i;
        return -1;
    }
    public void Afficher(int id)
    {
        int indice=Rechercher(id);
        if (indice!=-1)
            Pr[indice].Afficher();
        else
            System.out.println("L'identifiant n'existe pas");
    }
    public void Supprimer(int id)
    {
        int indice=Rechercher(id);
        if (indice!=-1) {
            for (int i=0 ;i<nbr_pr-1;i++) {
                this.Pr[i] = this.Pr[i + 1];
            }
            nbr_pr--;
        }
        else {
            System.out.println("Error");
        }
    }
    public void Changer_bureau(int id,int newB)
    {
        int result =Rechercher(id);
        if (result!=-1)
        {
            Pr[id].setBureau(newB);
        }
        else
            System.out.println("Error");
    }
    public void Afficher_liste(){
        System.out.println("Code du projet: "+code+" Sujet: "+sujet+" et la duree  "+this.duree+" J");
        for(int i=0;i<nbr_pr;i++)
            Pr[i].Afficher();
    }
    public void Afficher_liste(int semaine)
    {
        System.out.println("Code du projet: "+code+" Sujet: "+sujet+" et la duree  "+this.duree+" J");

            for (int i = 0; i < nbr_pr; i++){



        }
    }

}
