package Day_7_OPTIONALS;

import java.util.Optional;

public class a_NPEDemo {
    public static void main(String[] args) {

        /*OPTIONALS*/
        String name = null;


        //1st - With If-Else
        /*This is Not the proper code , we have to concise the code . we can do it by Optionals */
        if(name!=null)
        System.out.println(name.length());
        else
            System.out.println("No name Value");




        //2nd  - With Optionals (Intro In Java 8)
        //Creating Optional
        System.out.println("=== CREATING OPTIONAL ===");
        Optional<String> optionalString = Optional.of("Java"); // .of = yeh jo optional me humne string define kiya hain mtlb ki , ek Optional Box hain usme String define hain, jisme Java hain. return Optional[java]
        System.out.println(optionalString);



        //empty Optional
        System.out.println("=== EMPTY OPTIONAL ===");
        Optional<String> empty = Optional.empty(); //  .empty = yeh empty Optional ko define krta hain . return .empty
        System.out.println(empty);




        //null Optional
        System.out.println("=== NULL OPTIONAL ===");
        Optional<String> mayBe = Optional.ofNullable(null); // .ofNullable = define the null value , and return .empty
        System.out.println(mayBe);




        //If we are Give null in of . then we will get NULL-POINTER-EXCEPTION
       /* System.out.println("=== NULL-POINTER-EXCEPTION ===");
        Optional<String> val = Optional.of(null); // in of if we write null , it will return NULL POINTER EXCEPTION
        System.out.println(val);
       */



        //Checking Values = isPresent()
        System.out.println("=== isPresent() ===");
        System.out.println(optionalString.isPresent()); // true because, java is present
        System.out.println(mayBe.isPresent()); // false , because in mayBe null is pass.



        //isEmpty()
        System.out.println("=== isEmpty() ===");
        System.out.println(optionalString.isEmpty()); // false because, java is present
        System.out.println(mayBe.isEmpty()); // true , because in mayBe null is there toh empty hain.



        //get() = we can retrieve the value
        /*System.out.println("=== get() ===");
        System.out.println(optionalString.get()); // we will get here "Java"
        System.out.println(mayBe.get()); // no such element exception
       */





        /* 3rd = By Safe how can we retrieve value from Optional */
        /* The below all are the get() variation */

        //(i) orElse("default-value") = ek string return krna h toh yeh kro
        System.out.println(" === orElse(default value) ====");
        System.out.println(optionalString.orElse("default")); // if opstionalstring variable me koi value store ni hain toh yahan aa jayega or yeh default print kr dega, aur agr value store hain toh wohi wala print krega optionalstring wala
        //System.out.println(mayBe.orElse("default")); // // if mayBe variable me koi value store ni hain  yaa null hain toh yahan aa jayega or yeh default print kr dega, aur agr value store hain toh wohi wala print krega mayBe wala
        System.out.println(mayBe.orElse(null)); // this can be null also
        // Yeh bhi hum kr skte hain mayBe. check krega hain yaa nhi agar nhi hain toh orElse me chla jayega , simple hum yahan if else ka concise way me transformation dekh rhe hain.
        String temp = mayBe.orElse("default");
        System.out.println(temp);








        //(ii) orElseGet(<supplier>)= agr ek chota sa function execute krna h jisme value return kre toh hum yeh use kr skte h
        //a) On mayBe
        System.out.println("=== orElseGet Implementing on mayBe ===");
        String result = mayBe.orElseGet(() -> {
            System.out.println("Generating default value");
            return "default";
        });
        System.out.println(result); //mayBe null hain toh jo function ke andar h woh return hoga result me


        //b) on optionalString
        System.out.println("=== orElseGet Implementing on optionalString ===");
        String result1 = optionalString.orElseGet(() -> {
            System.out.println("Generating default value");
            return "default";
        });
        System.out.println(result1); //optionalString me java h toh result1 me java print hoga







        /* (iii) orElseThrow() = agar value present h toh return kr do aur agr nahi hain toh exception throw kr do */

        // a). on mayBe
        /*System.out.println("=== orElseThrow Implementing on mayBe ===");
        String newResult = mayBe.orElseThrow(
                () -> new RuntimeException("Not Found")
                );
        System.out.println(newResult); // mayBe is null so it will give exception
        */


        // b). on optionalString
        System.out.println("=== orElseThrow Implementing on optionalString ===");
        String newResult2 = optionalString.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult2); // mayBe is null so it will give exception
    }
}
