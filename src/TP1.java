import java.util.Scanner;
public class TP1 {
    public static void main(String[] args) {
        //////////////exercice 1////////////
        float []TH;
        float SN;
        float SB;
        float Retenue;
        int VH;
        TH=new float[3];
        String zone;
        TH[0]= 56.25f;
        TH[1]= 68.50f;
        TH[2]= 82.00f;
        Scanner nbr_vh;
        nbr_vh =new Scanner(System.in);
        System.out.print("Entrez le nombre d'heures :");
        VH=nbr_vh.nextInt();
        System.out.print("Entrez la zone d’exercice :");
        zone=nbr_vh.next() ;
        SB = switch (zone) {
            case "a" -> VH * TH[0];
            case "b" -> VH * TH[1];
            case "c" -> VH * TH[2];
            default -> 0;
        };
       Retenue= (float) (SB*0.019);
       SN=SB-Retenue;
        System.out.print("Salaire Brut    :  "+SB+" "+"  Retenue : "+Retenue+"  Salaire  net  "+SN);

        //////////////exercice 2////////////?????
       double P, D;//P:Poids //D:Duree
        double Prix_N,Prix_Sup;
        Scanner data;
        data = new Scanner(System.in);
        System.out.print("Entrez le Poids du passager :");
        P = data.nextInt();
        System.out.print("Entrez la Durée du vol :");
        D = data.nextInt();
        System.out.print("Entrez le prix de billet:");
        Prix_N= data.nextInt();
        if(P<=75)
            Prix_Sup = Prix_N;
        else if (P <= 90)
                if (D < 3)
                    Prix_Sup = Prix_N + (P - 75);
                else
                    Prix_Sup = Prix_N + (P - 75) * 1.5;
            else if (D < 3)
                Prix_Sup = Prix_N + 15 + (P - 90) * 2;
            else if (D < 6)
                Prix_Sup = Prix_N + 22.5 + (P - 90) * 2.5;
            else
                Prix_Sup = Prix_N + 22.5 + (P - 90) * 3;

            System.out.println("Le prix à payer est de " + Prix_Sup + " Euro");

//////////////////exercice 3////////////
        //partie 2
        int a;
        Scanner nbr;
        nbr = new Scanner(System.in);
        System.out.print("Entrez le nombre  :");
        a = nbr.nextInt();
        if (a % 2 == 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(a += 2);
            }
        }else {
            System.out.println("le nombre est n'a pas pairs");
        }
        //partie 1
        int A,B,P1=0;
        Scanner Produit ;
        Produit=new Scanner(System.in);
        System.out.print("Le nombre I :");
        A=Produit.nextInt();
        System.out.print("Le nombre II :");
        B=Produit.nextInt();
        for (int i=1;i<=B;i++) {
            P1 +=A;
        }
        System.out.print("Le produit de "+A+" est"+B+" egale : "+P1);

//////////////////exercice 4////////////
       Scanner n;
        int n_max,n_min;
        n =new Scanner(System.in);
        System.out.print("Entrez le nombre max :");
        n_max=n.nextInt();
        System.out.print("Entrez le nombre min :");
        n_min=n.nextInt();
        for (int i = n_min; i <= n_max; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

//////////////////exercice 5 ////////////
        //partie 1 : methode I
       int x,m=0;
        Scanner nbr_p;
        nbr_p=new Scanner(System.in);
        System.out.print("Entrez le nombre  :");
        x=nbr_p.nextInt();
        if (x!=0) {
            while (x > 0) {
                m += x % 10;
                x /= 10;
            }
        }else{
            System.out.print("Le nombre doit être positive");
        }
        System.out.println(m);
        //partie 1 : methode II

        //partie 2
        int c,d,u,nbr_cub;
        Scanner nbr_cubique;
        nbr_cubique=new Scanner(System.in);
        System.out.print("Entrez le nombre  :");
        nbr_cub=nbr_cubique.nextInt();
        c=(nbr_cub/100);
        d=(nbr_cub%100)/10;
        u=(nbr_cub%100)%10;
        int mt=0;
        for (int i=0 ;i<=u;i++){
            mt= (int) (Math.pow(c,u)+Math.pow(d,u)+Math.pow(u,u));
        }
        System.out.print(mt+"="+c+"^"+u+" "+d+"^"+u+" "+u+"^"+u);

//////////////////exercice 6 ////////////??????????????
        /*Scanner nbr_amis=new Scanner(System.in);
        int X,Y;
        System.out.print("Le nombre I :");
        X=nbr_amis.nextInt();
        System.out.print("Le nombre II :");
        Y=nbr_amis.nextInt();*/
        //////////////////exercice 7 ////////////
      int N,t=0;
        Scanner nParfait;
        nParfait = new Scanner(System.in);
      System.out.print("Entrez le numéro que vous testez  :");
        N=nParfait.nextInt();
        for (int i=1;i<N;i++){
            if (N%i==0)
                t += i;
        }
        if (t==N)
            System.out.println("le nombre "+N+" est parfait");
        else
            System.out.print("not parfai");
///////////////////////////////////////////////////////////////////

        System.out.print("Entrez le numéro que vous testez :");
        N = nParfait.nextInt();
        for (int j = N-1; j >= 0; j--) {
            int t1 = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    t1 += i;
                }
            }
            if (t1 == j) {
                System.out.println("le nombre parfait " + j);
            }
        }
//////////////////exercice 8////////////
        Scanner nbr_note;
        nbr_note=new Scanner(System.in);
        float note;
        System.out.print("Entrez le notes Svp :");
        note=nbr_note.nextFloat();
        if(note>=0 && note<=20){
            System.out.print("Merci la note saisie est correcte");
        }
        else{
            System.out.print("Ooops la note saisie est faux");
        }
        //////////////////////////////////////////////////////////
        int nbr1;
        System.out.print("Entrez le notes Svp :");
        nbr1=nbr_note.nextInt();
        if (nbr1<10)
            System.out.print("Plus petit ! !");
        else if (nbr1>20)
            System.out.print("Plus grand !");

////////////////////////exercice 9 comme 5 partie I//////////

////////////////////////exercice 10//////////
        Scanner n_etoiles;
        n_etoiles=new Scanner(System.in);
        System.out.print("le nombre d’étoiles : ");
        int l=n_etoiles.nextInt();
  //parier I
              for (int i=1;i<=l;i++){
                 for (int j=1;j<=l;j++) {
                     if (i==1 ||j==1 || i==l || j==l){
                     System.out.print("* ");
                     }else {
                         System.out.print("  ");
                     }
                 }
                 System.out.print("\n");
        }

  //parie II
       for (int i=1;i<=l;i++){
            for (int j=1;j<=l;j++) {
                if (i==1 ||j==1 || i==l || j==l || i==j || j==l-i+1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }




















    }
    }

