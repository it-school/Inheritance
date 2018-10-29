package itschool;

public interface IBicycle
{
    public int getWheelsQuantity();
    public void setWheelsQuantity(int wheelsQuantity);
    public Measurements.Frame getSize();
    public void setSize(Measurements.Frame size);
    public String toString();
}
