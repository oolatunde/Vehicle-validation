
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Driver
{
    public static void main (String [] args)
    {
        //declaration on variables
        int price;
        int mileage;
        char transmission;
        char sunRoof;
        double vehiclePrice;
        char SENTINEL = 'Y';

        DecimalFormat fmt = new DecimalFormat("#.##");
        //sentinel control loop. quit program when user input N
        while (!(SENTINEL == 'N'))
        {
            //new instance of Vehicle evaluation class
            VehicleValuation  vehicle = new VehicleValuation(); 
            System.out.println ("Vehicle Validation");
            System.out.println(vehicle.toString());

            //scanner to accept user input
            Scanner scan = new Scanner (System.in);      

            System.out.print ("Enter the price of your vehicle: ");
            price = scan.nextInt();
            vehicle.setVehiclePrice(price);

            System.out.print ("Enter the mileage of the vehicle: ");
            mileage = scan.nextInt();
            vehicle.setMileage(mileage);

            System.out.print ("Enter vehicle transmission (A-automatic M-manual): ");
            transmission = scan.next().charAt(0);
            vehicle.setTransmission(transmission);

            System.out.print ("Sunroof (Y/N): ");
            sunRoof = scan.next().charAt(0);
            vehicle.setsunRoof(sunRoof);

            System.out.println(vehicle.toString());

            //gets the new price 
            vehiclePrice = vehicle.getsunRoof();
            String vehiclePriceString = fmt.format(vehiclePrice);
            System.out.println("Your vehicle is now valued at: $" + vehiclePriceString);
            
            System.out.print ("Do you want to quit ? (Enter Y to continue and N to quit)");
            SENTINEL = scan.next().charAt(0);
        }
    }
}
