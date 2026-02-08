package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.BiConsumer;

public class v_BiConsumerDemo {
   public static void main(String[] args) {

       /*BI-CONSUMER*/
       //(i)As we know In Consumer there is no return type, so we are printing it
       BiConsumer<Integer, Integer> addConsumer = (a,b) -> System.out.println("Addition : "+ (a + b));
       // In consumer yahan accept chlta value dene ke liye, therefore, andthen() se hum chaining krte hain
       addConsumer.accept(10,20);
    }
}
