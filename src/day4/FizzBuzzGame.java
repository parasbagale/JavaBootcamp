package day4;

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number from 1 to N: ");
        double number = scanner.nextDouble();

        int i ;

        for(i=1 ; i <= number ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}
