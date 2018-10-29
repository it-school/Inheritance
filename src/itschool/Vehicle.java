package itschool;

public class Vehicle
{
    int maxSpeed;
    String title;
    String type;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle()
    {

    }

    public Vehicle(int maxSpeed, String title, String type) {
        this.maxSpeed = maxSpeed;
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
