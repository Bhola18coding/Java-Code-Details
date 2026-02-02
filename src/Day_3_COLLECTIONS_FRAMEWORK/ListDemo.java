package Day_3_COLLECTIONS_FRAMEWORK;

import java.util.ArrayList;
import java.util.List;

//Custom Object For applying the List Of Object
class Car{
    String brand;

    // Constructor
    Car(String brand) {
        this.brand=brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {


     //ArrayList
     // Yahan String Define kiya hain isliye string lega elements
        List<String> users = new ArrayList<>();


     // Adding the elements in our arraylist
        users.add("Alice");
        users.add("Bob");
       // users.add(20); (Error kyuki list avi string le rha h)

        // We can add duplicate also
        users.add("Alice");

        System.out.println("All Users");

       // For-each Loop for print the arraylist
       // Iteration
        for(String user:users) {
            System.out.println(user);
        }


        // Retrieving element from indexes
        System.out.println("Element using Index: " + users.get(0));

        // Out of bound error
       // System.out.println("Element using Index: " + users.get(10));



        //LIST OF OBJECT
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Mercedes");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("All cars");

        // Iteration
        for(Car car:carList) {
            System.out.println(car.brand);
        }

    }

}
