package Day_2_OOPS.H_Interfaces;

public class SportsCar implements CarControls{
    @Override
    public void turnRight() {
        System.out.println("Sports Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports Left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Sports Brakes");
    }
}
