////////////////Séance 1 de Java ////////////
import java.util.Scanner;
public class Java_Exp {
        public static void main(String[] args) {
/////////////////exp1///////////////////////
            int a,b,c;
            a=0;
            a++;
            System.out.println("1 :"+a);
            c=a;
            ++a;
            System.out.println("2 :"+a);
            b=a++;
            System.out.println("3 :"+a);
            System.out.println("4 :"+b);
            --c;
            System.out.println("5 :"+c);
            c=b--;
            System.out.println("6 :"+b);
            System.out.println("7 :"+c);
            --a;//origin c=--a;// IDE --a
            System.out.println("8 :"+a);
            System.out.println("9 :"+c);
            ///////////////////exp2////////////////
            int age;
            String nom;
            Scanner sr;
            sr=new Scanner(System.in);

            System.out.println("Entrez voter nom :");
            nom=sr.nextLine();
            System.out.println("Entrez voter l'age : ");
            age=sr.nextInt();
            System.out.println(" Bonjour Je m'appelle :"+nom+" est mon age"+age);

            ///////////////exp3///////////
            float longueur,largeur,surface;
            System.out.print("Entrez la longueur :");
            longueur=sr.nextFloat();
            System.out.print("Entrez la largeur :");
            largeur=sr.nextFloat();
            surface=largeur*longueur;
            System.out.print("La surface est :"+surface);

/////////////////////exp4////////////////////////////////////
            float math,phy,ang,fr,m;
            final int c_math=5,c_phy=4,c_ang=2,c_fr=3;
            int c1;
            Scanner sc ;
            sc=new Scanner(System.in);
            System.out.print("Entrer la note de math : ");
            math=sc.nextFloat();
            System.out.print("Entrer la note de phy : ");
            phy=sc.nextFloat();
            System.out.print("Entrer la note de ang : ");
            ang=sc.nextFloat();
            System.out.print("Entrer la note de fr : ");
            fr=sc.nextFloat();
            c1=(c_fr+c_ang+c_math+c_phy);
            m=((fr*c_fr)+(ang*c_ang)+(math*c_math)+(phy*c_phy))/c1;
            System.out.print(" La moyenne est : "+ m );


///////////////exrcice: test en note//////////
            float note;
            Scanner sc_note;
            sc_note=new Scanner(System.in);
            System.out.print("Entrer Voter Note :");
            note=sc_note.nextFloat();
            if(note>=10)
            {
                System.out.print("Valide");
            }else {
                System.out.print("Rattrapage");
            }

            //////////exrcice : max entre 3 nombre////////////////
            int x,y,z,max;
            Scanner max_nbr;
            max_nbr=new Scanner(System.in);
            System.out.print("Entrer nombre 1:");
            x=max_nbr.nextInt();
            System.out.print("Entrer nombre 2:");
            y=max_nbr.nextInt();
            System.out.print("Entrer nombre 3:");
            z=max_nbr.nextInt();
            if(x>y && x>z){
                max=x;
                System.out.print("le nombre max si 1 :"+max);
            } else if (y>x && y>z) {
                max=y;
                System.out.print("le nombre max si 2 :"+max);
            }else {
                max=z;
                System.out.print("le nombre max si 3 :"+max);
            }
/////////////exrcice :ecrire un programme qui permet de saisir un nombre et d'afficher sa valeur absolue////////////
            double nbr;
            Scanner nbr_absl;
            nbr_absl=new Scanner(System.in);
            System.out.print("Entrer Voter nombre :");
            nbr= nbr_absl.nextDouble();
            //////method 1
            if(nbr>=0){
                System.out.print("La valeur absolue  est " +nbr);
            }
            else{
                nbr*=-1;
                System.out.print("La valeur absolue  est " +nbr);
            }
            /////method 2
            if(nbr<0)
                nbr*=-1;
            System.out.print("La valeur absolue  est " +nbr);

            /////////////// exrcice :un magasin de reprographie facture /0.5:le dix premieres /0.25 :les vingt suivantes /0.1 :au-dela
            float nbr_p;
            double montan;
            Scanner nbr_pt;
            nbr_pt=new Scanner(System.in);
            System.out.print("Le nombre de photocopies :");
            nbr_p=nbr_pt.nextInt();
            if(nbr_p<=10){
                montan= nbr_p*0.5;
            } else {
                if (nbr_p <= 30)
                    montan = (nbr_p - 10) * 0.25 + 5;
                else
                    montan =10+ (nbr_p-20) * 0.1;
            }
            System.out.print("La montan de la facture est "+montan);


            //////////////saisie une tableau ////
            int[] t;
            t=new int[5];
            Scanner saisi;
            saisi =new Scanner(System.in);
            for(int i=0;i< t.length;i++){
                System.out.print("Effictation les valeurs  "+(i+1)+" : ");
                t[i]=saisi.nextInt();
            }
            for (int i=0;i< t.length;i++){
                System.out.println("Les valeurs de la tableau "+i +":"+t[i]);}


///////////// exrcice////////////
            int[] At;
            int N;
            int E;
            int E_nbr;
            E_nbr=0;
            Scanner A_t;
            A_t=new Scanner(System.in);
            System.out.print("Entrez votre nombre : ");
            E=A_t.nextInt();
            System.out.print("Entrez le nombre d'element de votre  tableau :");
            N=A_t.nextInt();
            At=new int[N];
            for(int i=0;i< N;i++){
                System.out.print("Effictation les valeurs  :"+(i+1)+" : ");
                At[i]=saisi.nextInt();
            }
            for (int i=0;i<N;i++){
                if(At[i]==E)
                    E_nbr+=1;}
            System.out.println("Le nombre d'occurrence de "+E+" est "+E_nbr);

            int[] Bt;//p_max: position max//p_min : position min
            int Max;
            int Min;
            int p_min;
            int p_max;
            Scanner B_t;
            B_t=new Scanner(System.in);
            System.out.print("Entrez le nombre d'element de votre  tableau :");
            N=B_t.nextInt();
            Bt=new int[N];
            for(int i=0;i< N;i++){
                System.out.print("Effictation les valeurs  "+(i+1)+" : ");
                Bt[i]=B_t.nextInt();
            }
            Max=Min=Bt[0];
            p_min=p_max=0;
            for (int i=0;i< N;i++){
                if(Bt[i]>=Max){
                    Max=Bt[i];
                    p_max=i;
                }
                if (Bt[i]<Min){
                    Min=Bt[i];
                    p_min=i;
                }
            }
            System.out.print("Le max est "+Max+" sa position  est "+p_max+" le min est "+Min+" sa position est "+p_min);
////////////////////exercice : calcule les solutions d'une equation ax² + bx + c = 0 en discutant la formule b²-4ac
            int A,C,B;
            double D;
            Scanner nbr_equation;
            nbr_equation=new Scanner(System.in);
            System.out.print("Entrer la valeur de a :");
            A=nbr_equation.nextInt();
            System.out.print("Entrer la valeur de b :");
            B=nbr_equation.nextInt();
            System.out.print("Entrer la valeur de c :");
            C=nbr_equation.nextInt();
            D=Math.pow(B,2)-4*A*C;
            if (D>0)
                System.out.print("L'equation ax² + bx + c = 0 a deaux solutions.");
            else if (D==0)
                System.out.print("L'equation ax² + bx + c = 0 a une unique solution.");
            else
                System.out.print("L'equation ax² + bx + c = 0 n'a pas de solutions reelle.");




        }
    }


