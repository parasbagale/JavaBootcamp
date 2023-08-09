package abstracT;

public class Main {
    public static void main(String[] args){

        //abstract = abstract class cannot be instantiated,
        // but they can have a sub abstract method are declared without an implementation

   //Vehicle vehicle = new Vehicle();
    Car car = new Car();
    car.go();
    car.stop();
    }
}
