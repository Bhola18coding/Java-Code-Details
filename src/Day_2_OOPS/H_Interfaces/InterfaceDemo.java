package Day_2_OOPS.H_Interfaces;

public class InterfaceDemo {
   public static void main(String[] args) {

//       Here we can See Team B ke saare method kaam kar rahe hain

//      ElectricCar e1 = new ElectricCar();
//      e1.applyBrakes();
//      e1.turnRight();


//     Ab hum jo jo cars banaye hain uske method Team A = Robot ko share kr denge chaahe jo v car chlaye sab chlega
//       1. Electric car use krna chata hain ROBOT
       CarControls myCar1 = new ElectricCar();
       myCar1.turnLeft();

//       2.Sports Car use karna chata hain Robot
         CarControls myCar2 = new SportsCar();
         myCar2.turnLeft();

    }
}
