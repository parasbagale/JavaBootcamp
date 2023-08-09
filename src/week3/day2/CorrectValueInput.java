package week3.day2;

import java.util.Scanner;

public class CorrectValueInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        int input;
        while(isValid){
            System.out.println("Enter a value (1 or 2): ");
            input = scanner.nextInt();

            if(input==1 || input==2){
                isValid = false;
            }else{
                System.out.println("please enter a correct value (1 or 2) :");
            }
        }
        System.out.println("You Enter the correct value: " );
    }
}
