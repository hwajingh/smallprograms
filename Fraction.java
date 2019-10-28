import java.util.Scanner;


    public class Fraction {

        private int num;
        private int den;

        public Fraction() {
            //constructor
        }



        public Fraction(int num, int den){
            this.num=num;
            this.den=den;

        }

        public int getNum(){
            return num;
        }

        public int getDen(){
            return den;
        }

        public void setNum(int num){
            this.num = num;
        }

        public void setden(int den){
            this.den=den;
        }

        public void print(){
            System.out.format("%d/%d\n", num, den);

        }

        public static long gcm(long num, long den) {
            return den == 0 ? num : gcm(den, num % den);
        }

        public static String asFraction(long num, long den) {
            long gcm = gcm(num, den);
            return (num / gcm) + "/" + (den / gcm);
        }





        public static void main(String[] args) {

                Fraction make = new Fraction(500, 1000);

          /* Scanner scan = new Scanner(System. in );
            System.out.println("input number 1: ");
            num = scan.nextInt();
            System.out.println("input number 2: ");
            den = scan.nextInt();*/




            if (make.den == 0)
            {System.err.println("Denominator cannot be zero");

            System.exit(0);}

            while (make.num != 0 && make.den != 0){
                if(make.num > make.den)
                    make.num = make.num % make.den;
                else
                    make.den = make.den %make.num;
            }

            System.out.print("\n Output :\n");
            System.out.println(asFraction(500, 1000)); //  "1/2"
            System.out.println(asFraction(17, 3));     //  "17/3"
            System.out.println(asFraction(462, 1071)); //  "22/51"

            System.exit(0);



        }
}
