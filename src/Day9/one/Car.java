package Day9.one;

public class Car extends Vehicle {
    private String ModelName =" Mustang";

    public static void main(String[] args){
        Car myFirstCar = new Car();
        myFirstCar.honk();

        System.out.println(myFirstCar.brand + " " + myFirstCar.ModelName);
    }

}
