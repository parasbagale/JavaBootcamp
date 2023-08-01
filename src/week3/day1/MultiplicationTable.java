package week3.day1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number for multiplication number :");
        int number = scanner.nextInt();
        int result=0;
        for(int i=1; i<=10; i++){
            result = i * number;
           System.out.println(result);
        }
    }
}
