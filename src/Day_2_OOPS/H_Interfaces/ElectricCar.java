package Day_2_OOPS.H_Interfaces;

public class ElectricCar implements CarControls{

//    CarControls ke saare method yahan define kar denge, agar define nahi krte toh abstract keyword de skte h behind public toh error chla jayega
    @Override
    public void turnRight() {
        System.out.println("ELECTRIC RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("ELECTRIC LEFT");
    }

    @Override
    public void applyBrakes() {
        System.out.println("ELECTRIC BRAKES");
    }
}
