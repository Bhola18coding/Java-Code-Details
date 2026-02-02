package Day_3_COLLECTIONS_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //SET
        Set<String> roles = new HashSet<>();
        roles.add("Admin");
        roles.add("Manager");
        roles.add("Merchant");
        roles.add("Manager"); //Duplicate value will not display

        for(String role: roles)
        {
            System.out.println("ROLES : " + role);
        }

        // In set there is no index
       // System.out.println(roles.get(0));
    }

}
