package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.Predicate;

public class vi_PredicateDemo {
   public static void main(String[] args) {

       //PREDICATE
       // yeh represent krta h ek argument aur boolean return krta hain.

       Predicate<Integer> isEven = n -> n % 2 == 0;

       //.test se hi argument pass krke check kr skte h that it is true or false
       System.out.println(isEven.test(10)); //true , it is even
       System.out.println(isEven.test(11)); //false , it is odd
    }
}
