package abstracT;

public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }

    @Override
    void stop() {
        System.out.println("The driver is stopped the car ");
    }
}
