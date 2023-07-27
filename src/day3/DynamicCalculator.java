package day3;

import java.util.Scanner;

public class DynamicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double first_number = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double second_number = scanner.nextDouble();
        System.out.println("Enter the operation that you want to perform(+,-,*,/): ");
        String operation = scanner.next();

        double result = 0.0;

        if (operation.equals("+")) {
            result = first_number + second_number;
        } else if (operation.equals("-")) {
            result = first_number - second_number;
        } else if (operation.equals("*")){
            result = first_number * second_number;
        }else if (operation.equals("/")){
            result = first_number / second_number;
        }else{
            System.out.println("Invalid operation!");
            return;
        }
        System.out.println(first_number + " " + operation + " " + second_number + "=" + result);
    }
}
