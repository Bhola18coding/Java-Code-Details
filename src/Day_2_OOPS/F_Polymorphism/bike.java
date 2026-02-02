package Day_2_OOPS.F_Polymorphism;

public class bike extends vehcile {
    private boolean hashCarrier;

//  Constructor of veciel adding the bike property also
    public bike(String brand, int speed, boolean hashCarrier) {
        super(brand, speed);
        this.hashCarrier=hashCarrier;
    }

//    Getter
    public boolean isHashCarrier() {
        return hashCarrier;
    }

//    Here also we use Method override same as car class , super wala parent class ke method ko call kr rha h
//    isHassCarrier kyuki getter hain
    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Brand: "+ brand + ", speed of: " + speed + " km per hour"+" "+ "condn is: "+ hashCarrier);
    }

//    Runtime Polymorphism
//    Same yahan v override h
    @Override
    public void start() {
        System.out.println("Starting a Bike....");;
    }

//  Compile Time Polymorphism
    public void start(String greet) {
        System.out.println("Starting a Bike...."+ greet);;
    }



}
