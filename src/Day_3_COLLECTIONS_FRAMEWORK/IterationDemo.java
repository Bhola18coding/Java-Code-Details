package Day_3_COLLECTIONS_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationDemo {
    public static void main(String[] args) {


        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Alice");


        // ITERATIVE TYPES

        //1.
        // Simple retrieve but no benefit in future
        System.out.println("Using Index");
        System.out.println(users.get(0));

        //2.
        // For-each Loop for print the arraylist
        System.out.println("Using For-Each");
        for(String user:users) {
            System.out.println(user);
        }

        //3.
        // Using For-Loop
        System.out.println("Using FOR-LOOP");
        for(int i=0; i< users.size(); i++) {
            System.out.println(users.get(i));
        }


        //4.
        // Using ITERATOR
        System.out.println("Using Iterator");
        Iterator<String> it = users.iterator(); //Object Created
        while (it.hasNext()){
            System.out.println(it.next());
        }



       // Removing The Element By the help of Iterator
      /*  System.out.println("Using Iterator");
        Iterator<String> it = users.iterator(); //Object Created
        while (it.hasNext()){
            if(it.next().equals("Bob")) {
                it.remove();
            }
        }

        for(String user: users){
            System.out.println(user);
        }
       */



    }


}
