package itschool;

public class Bicycle extends Vehicle implements IBicycle
{
    int wheelsQuantity;
    Measurements.Frame size;

    public Bicycle()
    {
        super();
    }

    public Bicycle(int maxSpeed, String title, String type, int wheelsQuantity, Measurements.Frame size) {
        super(maxSpeed, title, type);
        this.wheelsQuantity = wheelsQuantity;
        this.size = size;


    }

    public int getWheelsQuantity() {
        return wheelsQuantity;
    }

    public void setWheelsQuantity(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
    }

    public Measurements.Frame getSize() {
        return size;
    }

    public void setSize(Measurements.Frame size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheelsQuantity=" + getWheelsQuantity() +
                ", size=" + size +
                ", maxSpeed=" + maxSpeed +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
