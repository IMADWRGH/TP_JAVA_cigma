package TP_heritage.TP2;

public interface IBiblio {
    void Ajouter(Document D);
 void  Modifier(int tref, String titre);
void  Supprimer(int ref);

void  Afficher(int ref);
}
