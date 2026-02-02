package Day_3_COLLECTIONS_FRAMEWORK;

import java.util.ArrayList;
import java.util.List;

//Custom Object For applying the List Of Object
class CarNew{
    String brand;

    // Constructor
    CarNew(String brand) {
        this.brand=brand;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {


        //ArrayList
        // Yahan String Define kiya hain isliye string lega elements

        // Generic Type
        List<String> users = new ArrayList<>();

        // Normal Object Type
       //List users = new ArrayList<>();


        // Adding the elements in our arraylist
        users.add("Alice");
        users.add("Bob");
        // users.add(20); (Error kyuki list avi string le rha h)

        // We can add duplicate also
        users.add("Alice");

        System.out.println("All Users");

        // For-each Loop for print the arraylist
        // With Generic Type Iteration
        for(String user:users) {
            System.out.println(user);
        }

        // With Object Type Iteration
        /* for(Object user:users) {
            System.out.println(user);
        }*/


        // Retrieving element from indexes
        System.out.println("Element using Index: " + users.get(0));

        // Out of bound error
        // System.out.println("Element using Index: " + users.get(10));



        //LIST OF OBJECT
        CarNew car1 = new CarNew("Toyota");
        CarNew car2 = new CarNew("Mercedes");
        List<CarNew> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("All cars");

        // Iteration
        for(CarNew car:carList) {
            System.out.println(car.brand);
        }

    }

}

