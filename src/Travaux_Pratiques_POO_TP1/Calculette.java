/////////////////////Séance 2 de Java: Exercie 1 ///////////////////

package Travaux_Pratiques_POO_TP1;

public class Calculette {
        private double nbr1;
        private double nbr2;

        public double Addition()
        {
            return nbr1+nbr2;
        }

        public double Multiplication()
        {
            return nbr1*nbr2;
        }

        public double Division()
        {
            return nbr1/nbr2;
        }

        public double Soustration()
        {
            return nbr1-nbr2;
        }
        public void setnbr(double x,double y)
        {
            this.nbr1=x;
            this.nbr2=y;

        }
        public Calculette(double nbr1, double nbr2) {
            this.nbr1 = nbr1;
            this.nbr2 = nbr2;
        }
    public static void main(String[] args) {
            Calculette C=new Calculette(8,0);
            C.setnbr(1,0);
            System.out.println("La somme est : "+C.Addition());
            try{
                System.out.println("La divition  est : "+C.Division());
            }catch (Exception ex){
                System.out.println("Divition par 0 est impossiple");
            }
            System.out.println("La soustration est : "+C.Soustration());
            System.out.println("La multiplication  est : "+C.Multiplication());


        }
    }

