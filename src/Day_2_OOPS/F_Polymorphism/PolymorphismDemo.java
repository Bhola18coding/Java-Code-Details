package Day_2_OOPS.F_Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {

        car c1=new car("BMW", 250, 5);
        c1.displayInfo();

//        Here we achieve the door by getter
        System.out.println(c1.getDoors());


//        Bike Object
        bike b1=new bike("Mercedes", 500, true);
        b1.displayInfo();

//        Hum car & Bike ke object se vehcile class ke start method ko access kr paa rhe h
        c1.start();
        b1.start();

//        We will achieve the hascarrier by getter
        System.out.println(b1.isHashCarrier());

//        Vehcile Object reation
        /*
        vehcile v1=new vehcile("VechBrand", 200);
        v1.start();
        */


//        RUNTIME POLYMORPHISM => (Method Overriding)
//        Parent and Child class Reln in Object Creation
          vehcile v2 = new car("Ford", 100, 6);
          v2.start(); // Isme car me jo Override kiya hain wo call hoga


//        COMPILE-TIME POLYMORPHISM => (Method Overloading)
//        Jab ek same name method multiple use ho skta h. with parameter and non parameter is called Method overloading
         b1.start("Hello"); //One with parameter
         b1.start();   // One with Non Parameter
    }
}
