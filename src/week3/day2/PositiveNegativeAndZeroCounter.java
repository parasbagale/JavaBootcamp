package week3.day2;

import java.util.Scanner;

//write a program that inputs five numbers and determines and print the number of negative number input, the number of positive numbes
//and the number of zeros input.
//Ex: 3,6,0,6,3,-4,-2 : negative number :2 positive :4 zero:1
//hint: can use array to store elements and loop to check accordingly.
public class PositiveNegativeAndZeroCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int negativeCounter = 0;
        int positiveCounter =0;
        int zeroCounter=0;
        System.out.println("Enter any five numbers: ");
        for(int i=0; i<5; i++){
            int numbers = scanner.nextInt();
            if(numbers<0){
                negativeCounter++;
            }else if(numbers>0){
                positiveCounter++;
            }else{
                zeroCounter++;
            }

        }
        System.out.println("negative number: " + negativeCounter);
        System.out.println("positive number: " + positiveCounter);
        System.out.println("zero number: " + zeroCounter);
        scanner.close();
    }
}
