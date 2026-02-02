package Day_2_OOPS.F_Polymorphism;

public class car extends vehcile {
    private int doors;

//    Constructor of matching the vechile as jo value aayega wo vechiel me chla jayega
    public car(String brand, int speed, int doors) {

     // Super = public ya private koi bhi rahe in vechiel
     // this = if only public rahe toh warna private me only super hi kaam krega
        super(brand, speed);
        this.doors=doors;
    }

//    Door is private so we will achieve by getter
    public int getDoors()
    {
        return doors;
    }


     // METHOD OVERRIDING
//    Yahan in car class hum kya kar rahe hain ki , displayinfo jo ki parent class ka method h usko hum override kr denge in car class
//    In parent class i.e-> vechile class , usme kya tha ki door jo ki car class ka property hain usko object ke through access nahi kar paate the but now
//    car class ne displayinfo() method override kr liya hain toh ab door wala property bhi access kr paayenge hum through object
    @Override
    public void displayInfo() {

//        super.displayInfo();   isliye kyuki parent class ka display le rhi thi with super keyword par humein humara wala chahiye . car class ka
          super.displayInfo(); // isse parent and car class me jo override hain dono chlega
        System.out.println("Brand: "+ brand + ", speed of: " + speed + " km per hour"+ "doors of: "+ doors);
    }

//    Runtime Polymorphism
//   yeh humne yahan override kiya hain
    @Override
    public void start() {
        System.out.println("Starting a car....");;
    }
}
