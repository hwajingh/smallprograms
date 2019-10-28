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

    public void setfuel() {
        this.fuel = fuel;
    }


    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double add) {
        this.odometer = add + 10000;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    ;


    public void setMilesDriven() {
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


    }
}
