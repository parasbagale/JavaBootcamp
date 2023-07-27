package day4;

import java.util.Scanner;

public class CheckAge {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        if(age > 0 && age <= 13){
            System.out.println("you are child");
        }else if(age > 13 && age <= 30){
            System.out.println("you are adult");
        }else if(age > 30 && age <= 50){
            System.out.println("you are middle age");
        }else if(age > 50 && age <= 100){
            System.out.println("you are old");
        }else{
            System.out.println("print enter a valid age");
        }
        scanner.close();


    }
}
