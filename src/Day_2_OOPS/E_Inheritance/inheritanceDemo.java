package Day_2_OOPS.E_Inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {

        car c1=new car("BMW", 250, 5);
        c1.displayInfo();

//        Here we achieve the door by getter
        System.out.println(c1.getDoors());


//        Bike Object
        bike b1=new bike("Mercedes", 500, true);
        b1.displayInfo();

//        We will achieve the hascarrier by getter
        System.out.println(b1.isHashCarrier());


    }
}
