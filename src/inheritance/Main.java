package inheritance;

public class Main {
    public static void main(String[] args){

        Car car =new Car();
        car.stop();
        car.go();
        System.out.println(car.doors);

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        System.out.println(bicycle.wheel);
    }
}
