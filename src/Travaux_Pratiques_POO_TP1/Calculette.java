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
            double result;
            if (nbr2>0)
            { result= nbr1/nbr2;}
            else
            { result = 0.0d;}
            return result;
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
            //double r1,r2,r3,r4;
            Calculette C=new Calculette(1.5,1.5);
            C.setnbr(2.25,10);
            System.out.println("La somme est : "+C.Addition());
            System.out.println("La divition  est : "+C.Division());
            System.out.println("La soustration est : "+C.Soustration());
            System.out.println("La multiplication  est : "+C.Multiplication());


        }
    }

