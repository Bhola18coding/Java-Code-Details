package Day_4_EXCEPTION_HANDLING;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
   public static void main(String[] args) {

       /* At first, Lets understand that our code is running line by line */
       // 1. Exception with No O/p
       /*
       // It will exception error = Arithmetic Exception, and uske nice jo v code rahega woh nhi execute hoga
       int a = 10;
       int res = 10 / 0;  // Arithmetic Exception error
       System.out.println("Done");
       */





       /*
       //2.  Exception with output
       // It will exception error = Arithmetic Exception, and uske nice jo v code rahega woh nhi execute hoga , Han jo upar hain woh execute hoga
       int b = 10;
       System.out.println("Done"); // execute hoga
       int result = 10 / 0;  // Arithmetic Exception error
       System.out.println("Done"); // kuch nahi aayega iske upar error hain
       */






       //3. Try & Catch Block = (For Handling the Exception)

       //(i). Syntax of Exception Handling

       // If try mein Exception Generate hoga toh catch mein chla jayega
       try {
           //Exception Generating Statements
           int res = 10 / 0;

       } catch(Exception e) {
           //Exception Handling Statements
           System.out.println("In catch Block");
       }

         /* RULES OF EXCEPTION HANDLING For further use in Spring Boot */

       //(ii) If try mein koi exception na ho aur catch bhi hain sath me tab bhi try hi chlega aur catch execute nahi hoga
       try{
           int res= 10/3;
           System.out.println("Done");
       } catch (Exception ex){
           System.out.println("Catch Block");
       }

       //(iii) Lekin , sirf try dene se nahi chlega catch bhi saath me humesha dena padega nahi toh error dega
       // Han hum finally de skte hain Instead of catch lekin woh baad me dekhenge
     /* try {
          // Exception Generate
      } // Here if not catch or finally then error
     */


       //(iv) If try block execute na ho and catch block execute ho uske baad jo bhi bahar line hoga wo execute hoga hi.
       // Same if try block execute ho and catch na ho fir v bahar wala code execute hoga hi.

       try{
           int res= 10/0;

       } catch (Exception ex){
           System.out.println("Catch Block");
       }
       System.out.println("Done");




       //(v) IndexOutOfBound exception
       int[] a={1,2,3};
       try{
           // It will throw exception error
           System.out.println(a[6]);
       } catch (Exception e) {
           // If upper one will exception error yeh wala fr print hoga
           System.out.println("At up it was Indexoutofbound exception");
       }
       System.out.println("Outside Try Catch");


       //(vi) Exception Hierarchy in our pc as screenshot



       // (vii) CHECKED EXCEPTION & UNCHECKED EXCEPTION
       // At first hum Filereader ko initialize kiye toh jab object me txt file pass kiya toh error aaya . toh humein forcefully Try catch dena pada ki error na aaye ise kehte hain Checked Exception. aur jo baaki exception humne dekha use Unchecked Exception Kehte hain
       try {
           FileReader file = new FileReader("abc.txt");
       } catch (FileNotFoundException e) {
           //throw new RuntimeException(e);
       }




       // (viii) Try block with multiple catch block and finally block at last
       // ek try block me multiple catch blocks lgega and at last hum finally denge
       int[] b={1,2,3};
       try{
           // It will throw exception error
           //System.out.println(b[6]);

           //If its not an exception toh fir bhi finally chlega
           System.out.println(b[2]);
       }
       //1st catch block
       catch (IndexOutOfBoundsException e) {

       }
       //2nd Catch Block
       catch (Exception e) {
           // If upper one will exception error yeh wala fr print hoga
           System.out.println("At up it was Indexoutofbound exception");
       }
       // final block - Always Execute
       finally {
           System.out.println("Yeh final hain yeh humesha chlega chaahe catch ya try block chle yaa naa chle");
       }
       System.out.println("Outside Try Catch");



   }
}
