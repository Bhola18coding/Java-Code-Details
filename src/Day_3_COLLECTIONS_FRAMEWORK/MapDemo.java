package Day_3_COLLECTIONS_FRAMEWORK;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        //MAP
        Map<Integer, String> userMap = new HashMap<>();

        //For Inserting the key , value we use put
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Charlie");

        // We can get the user with the key only
        System.out.println("user with id 2 :" + userMap.get(2));

        // Iterating through the map
        System.out.println("All Users");
        for(Map.Entry<Integer, String> entry: userMap.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
