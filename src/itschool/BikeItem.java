package itschool;

import java.util.Date;

public class BikeItem implements IBicycle, IItem
{
    private double price;
    private int wheelsQuantity;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "" + getWheelsQuantity() + " " + String.format("%20.3f", getPrice());
    }

    @Override
    public int getWheelsQuantity() {
        return this.wheelsQuantity;
    }

    @Override
    public void setWheelsQuantity(int wheelsQuantity)
    {
        this.wheelsQuantity = wheelsQuantity;
    }

    @Override
    public Measurements.Frame getSize() {
        return null;
    }

    @Override
    public void setSize(Measurements.Frame size) {

    }

}
