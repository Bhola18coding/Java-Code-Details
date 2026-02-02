package Day_2_OOPS.E_Inheritance;

public class vehcile {

    public String brand;
    public int speed;

//    Constructor
    public vehcile(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

//    Getter and Setter of Brand and speed
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void displayInfo()
    {
        System.out.println("Brand: "+ brand + ", speed of: " + speed + " km per hour");
    }
}
