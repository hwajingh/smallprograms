import java.util.Scanner;
public class Odometer {

    //instance data of miles drivesn and the fuel efficiency
    // in miles per gallon. Include a mutator method to reset
    // the odometer to zero miles, a mutator method to set the fuel efficiency,
    // a mutator method which accepts the miles driven for a trip and adds it to the odometer’s total,
    // and an accessor method that returns the number of gallons of gasoline that the vehicle has
    // consumed since the last reset. Include a main method that creates an instance of the class
    // and invokes the methods for testing.

    private double milesDriven;
    private double fuelEff; // miles per gallon
    private double odometer;
    private double fuel;

    public double getFuel() {
        return fuel;
    }

    // FIX: the original took no parameter and self-assigned (this.fuel = fuel).
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    // Compatibility alias for the original lowercase name.
    public void setfuel(double fuel) {
        setFuel(fuel);
    }


    public double getOdometer() {
        return odometer;
    }

    // FIX: the original silently added 10000 to every value.
    // Per the class comment, this adds a trip's miles to the odometer total.
    public void setOdometer(double miles) {
        this.odometer += miles;
    }

    public void resetOdometer() {
        this.odometer = 0;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    ;


    // FIX: the original took no parameter and self-assigned.
    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }


    public static double getMilesDriven(double milesDriven) {
        return milesDriven;
    }

    public static double fueleff(double milesDriven, double fuel) {

        return milesDriven / fuel;
    }


    public static void main(String[] args) {

        double GallonsUsed = 0.0;
        double milesdriven = 0.0;
        double odometer = 10000.0;
        System.out.println(" the miles have been reset to zero  \n");
        System.out.println(" please enter the amount of miles driven for a trip \n");
        System.out.println(" the miles on the odometer is 10000");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles Driven  ");
        milesdriven = input.nextDouble();

        System.out.println("Enter Gallons used to fill tank  ");
        GallonsUsed = input.nextDouble();
        System.out.println("The Fuel efficiency is ");
        System.out.println(fueleff(milesdriven, GallonsUsed));
        System.out.println("The total of odometer after this trip is " + (odometer + milesdriven) + "miles");

        // FIX: main previously ignored the object entirely and used only
        // local variables. Wire it to an Odometer instance.
        Odometer car = new Odometer();
        car.setMilesDriven(milesdriven);
        car.setFuel(GallonsUsed);
        car.setOdometer(milesdriven);
        System.out.println("Odometer object: miles driven = " + car.getMilesDriven()
                + ", odometer total = " + car.getOdometer()
                + ", fuel = " + car.getFuel());


    }
}
