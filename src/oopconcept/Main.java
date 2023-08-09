package oopconcept;

public class Main {
    public static void main(String[] args){
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.color);
        System.out.println(myCar2.color);

        System.out.println(myCar1.price);
        System.out.println(myCar2.price);

        myCar1.drive();
        myCar2.brake();



    }
}
