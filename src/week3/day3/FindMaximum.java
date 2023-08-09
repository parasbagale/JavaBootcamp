package week3.day3;

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number you wants to enter :");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;// initialize the max value to very small value.

        for(int i= 0; i < n; i++){
            System.out.println("enter number " + (i +1) + ":");//prompt the user for each number
            int number = scanner.nextInt();

            if(number>max){
                max = number;
            }
        }
        System.out.println("the maximum value is : " + max);
        scanner.close();

    }
}
