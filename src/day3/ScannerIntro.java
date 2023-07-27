package day3;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name + "!");


    }
}
