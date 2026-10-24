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

        // FIX: renamed gcm -> gcd (it computes a greatest common divisor),
        // and asFraction now guards den == 0 instead of dividing by zero.
        public static long gcd(long num, long den) {
            return den == 0 ? num : gcd(den, num % den);
        }

        public static String asFraction(long num, long den) {
            if (den == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero");
            }
            long gcd = gcd(num, den);
            return (num / gcd) + "/" + (den / gcd);
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

            // FIX: deleted the dead Euclid loop here — it mutated
            // make.num/make.den and its result was thrown away, since
            // the lines below print asFraction(500, 1000) etc. directly.

            System.out.print("\n Output :\n");
            System.out.println(asFraction(500, 1000)); //  "1/2"
            System.out.println(asFraction(17, 3));     //  "17/3"
            System.out.println(asFraction(462, 1071)); //  "22/51"

            System.exit(0);



        }
}
