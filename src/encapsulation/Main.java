package encapsulation;

public class Main {
    public static void main(String[] args){

        //Encapsulation = attribute of a class will be hidden or private, can be accessed only through the method (getter and setters)

        Car car = new Car("Honda","Civic", 2020);
        System.out.println(car.getMake());
        System.out.println(car.getYear());

        car.setYear(2022);
        System.out.println(car.getYear());

    }
}
