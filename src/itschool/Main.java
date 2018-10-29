package itschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Vehicle v = new Vehicle(200, "tURTLE", "Animal");
        Bicycle b = new Bicycle(100, "Bike", "Penny-Farting", 2, Measurements.Frame.XXL);

        System.out.println(v);
        System.out.println(b);
/*
        v = b;
        System.out.println(v);
        System.out.println(b);
*/

        BikeItem bikeItem = new BikeItem();
        bikeItem.setPrice(1000);
        bikeItem.setWheelsQuantity(3);
        System.out.println(bikeItem);


    BikeItem [] bikes = new BikeItem[5];
        bikes[0] = new BikeItem();
        bikes[1] = new BikeItem();
        bikes[2] = new BikeItem();
        bikes[3] = new BikeItem();

//        ArrayList
    }
}
