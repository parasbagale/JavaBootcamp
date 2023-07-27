package day5;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (Kg): ");
        float weightOfPerson = scanner.nextFloat();

        System.out.print("Enter your height (m): ");
        float heightOfPerson = scanner.nextFloat();

        double BMI = weightOfPerson/(heightOfPerson * heightOfPerson);


        System.out.println("Your BMI: " + BMI );
    }
}
