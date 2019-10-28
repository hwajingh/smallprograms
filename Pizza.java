import java.util.Scanner;


public class Pizza {


    private int cheesecount;
    private int hamcount;
    private int pepcount;
    private int size;

    public void setcheesecount(int cheesecount) {
        this.cheesecount = cheesecount;
    }

    public int getcheesecount() {
        return cheesecount;
    }

    public void sethamcount(int hamcount) {
        this.hamcount = hamcount;
    }
    public int getHamcount() {
        return hamcount;
    }

    public void setPepcount(int pepcount) {
        this.pepcount = pepcount;
    }

    public int getPepcount(){
        return pepcount;
    }



    public Pizza(int size, int cheesecount, int hamcount, int pepcount)
    {
        this.size= size;
        this.cheesecount = cheesecount;
        this.hamcount = hamcount;
        this.pepcount= pepcount;
    }

     public int calCost(int size, int cheesecount, int hamcount, int pepcount )
    {
        if (size == 1) {
            return (10+(cheesecount*2)+(hamcount*2)+(pepcount*2));
        } else if (size == 2) {
            return (12+(cheesecount*2)+(hamcount*2)+(pepcount*2));
        } else {
            return (14+(cheesecount*2)+(hamcount*2)+(pepcount*2));
        }
    }

    public String getDescription(int size, int cheesecount, int hamcount, int pepcount ) {

        String sizeofpizza = "nothing";
        int priceofpizza = 0;

        if (size == 1) {
            sizeofpizza = "small";
            priceofpizza = 10;
        } else if (size == 2) {
            sizeofpizza = "medium";
            priceofpizza = 12;

        } else {
            sizeofpizza = "large";
            priceofpizza = 14;

        }


        return  "Pizza " +
                "is " + sizeofpizza +
                " with " + cheesecount + " cheese, " +
                +pepcount + " pepperoni and " +
                +hamcount + " ham should cost " + calCost(size, cheesecount, hamcount, pepcount) + " dollars";
    }


    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println(" please enter the desired size. (1) small ");
        System.out.println( " (2) medium, and (3) large \n");

        Pizza order= new Pizza(1, 2, 1, 1);

        System.out.println(order.getDescription(1, 2,1, 1));


        Pizza order1= new Pizza(2, 2, 2, 0);

        System.out.println(order.getDescription(2, 2,2, 0));

        Pizza order2= new Pizza(3, 2, 1, 1);

        System.out.println(order.getDescription(3, 2,1, 1));


    }
}