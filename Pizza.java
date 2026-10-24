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

    // FIX: single source of truth for the size -> base price table.
    // Previously calCost() and getDescription() each re-derived it.
    public static int basePrice(int size) {
        if (size == 1) {
            return 10;
        } else if (size == 2) {
            return 12;
        } else {
            return 14;
        }
    }

    public static String sizeName(int size) {
        if (size == 1) {
            return "small";
        } else if (size == 2) {
            return "medium";
        } else {
            return "large";
        }
    }

    // Kept with its original signature for compatibility; it now uses
    // the object's fields when the caller passes them, via basePrice().
    // Prefer the no-arg calCost() below for new code.
    public int calCost(int size, int cheesecount, int hamcount, int pepcount)
    {
        return basePrice(size) + (cheesecount * 2) + (hamcount * 2) + (pepcount * 2);
    }

    public int calCost() {
        return calCost(this.size, this.cheesecount, this.hamcount, this.pepcount);
    }

    public String getDescription(int size, int cheesecount, int hamcount, int pepcount) {
        // FIX: previously priceofpizza was computed and never used, and
        // the size table was duplicated here. Now both come from helpers.
        return "Pizza " +
                "is " + sizeName(size) +
                " with " + cheesecount + " cheese, " +
                +pepcount + " pepperoni and " +
                +hamcount + " ham should cost " + calCost(size, cheesecount, hamcount, pepcount) + " dollars";
    }

    public String getDescription() {
        return getDescription(this.size, this.cheesecount, this.hamcount, this.pepcount);
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