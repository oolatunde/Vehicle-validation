
/**
 * Write a description of class VehicleValuation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class VehicleValuation
{
    // instance variables 
    static private int mileage;
    static private char transmission;
    static private char sunRoof;
    static private  int vehiclePrice;
    static private  double vehicleValue;
    /**
     * Constructor for objects of class VehicleValuation
     */
    public VehicleValuation()
    {
        // initialise instance variables
        int vehiclePrice;
    }

    public int getVehiclePrice()
    {
        return vehiclePrice;
    }

    public int setVehiclePrice(int vehiclePrice)
    {
        this.vehiclePrice = vehiclePrice;
        return vehiclePrice;
    }

    public int setMileage( int mileage)
    {
        this.mileage = mileage;
        return mileage;
    }
    
    public double getMileage()
    {
        if((mileage > 0) && (mileage <= 59999))
        {
            vehicleValue = getVehiclePrice() - (getVehiclePrice() * 0.30); // lose 30 percent of original price
        }

        if((mileage >= 60000) && (mileage <= 99999))
        {
            vehicleValue = getVehiclePrice() - (getVehiclePrice() * 0.35); // lose 35 percent of original price
        }

        if((mileage >= 100000) && (mileage <= 199999))
        {
            vehicleValue = getVehiclePrice() - (getVehiclePrice() * 0.40); // lose 40 percent of original price
        }

        if((mileage >= 200000))
        {
            vehicleValue = getVehiclePrice() - (getVehiclePrice() * 0.50); // lose 50 percent of original price
        }
        return vehicleValue;
    }

    public char setTransmission(char transmission)
    {
        this.transmission = transmission;
        return transmission;
    }

    public double getTransmission()
    {
        switch (transmission)
        {
            case 'A': if (transmission == 'A')
            {
                vehicleValue =  getMileage() + (0.05 * getVehiclePrice());
            }
            break;
            case 'M': if(transmission == 'M')
            {
                vehicleValue =  getMileage() - (0.05 * getVehiclePrice());
            }
            break;
            default: System.out.println ("Incorrect transmission");
        }
        return vehicleValue;
    }
    
    public char setsunRoof(char sunRoof)
    {
        this.sunRoof = sunRoof;
        return sunRoof;
    }
    
    public double getsunRoof()
    {
        if (sunRoof == 'Y')
        {
             vehicleValue = getTransmission() + (0.10 * getVehiclePrice()) ;
        }
        if (sunRoof == 'N')
        {
            vehicleValue =  getTransmission();
        }
        return vehicleValue;
    }

    @Override
    public String toString()
    {
        return
        "------------------------------------------------------------------";
    }
}
