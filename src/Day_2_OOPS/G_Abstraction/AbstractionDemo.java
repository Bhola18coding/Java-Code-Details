package Day_2_OOPS.G_Abstraction;

public class AbstractionDemo {
   public static void main(String[] args) {

//     Child class ka Reference and object dono create hoga

       SavingAccount savingaccount1 = new SavingAccount("kkkjsk", 7856.77);
       savingaccount1.deposit(100);


//     BankAccount ko reference maan kar , savingAccount class ka object create kr skte hain.
//     in previous lectures we have learned about i.e-> Polymorphism, Parent clas= Ref, Child class= object.
       BankAccount savingaccount2 = new SavingAccount("kkkk", 567.66);


//     Hum chaahe toh , savingAccount2 se currentAccount jo hain uska bhi object create kr skte hain,
//     If Humne , currentclass ko extend kiya hain from Bankaccount class jo ki ek parent class hain.


//       Yahan bhi savingaccount2 hain jo upar me ref hain same . yahan jo accountNumbr define kr rhe hain, yeh overwrite kr de rha h upar wala (IMPORTANT CONCEPT)
       savingaccount2 = new CurrentAccount( "Bhola980", 7869.56);
       savingaccount2.deposit(200);
       savingaccount2.withdraw(500);

//       Getter output
       System.out.println(savingaccount1.getAccountNumber());
       System.out.println(savingaccount2.getAccountNumber());


    }
}
