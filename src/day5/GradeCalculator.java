package day5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtain by student :");
        double mark = scanner.nextDouble();

        if(mark>=90){
            System.out.println("Grade : A");
        }else if(mark>=80) {
            System.out.println("Grade : B");
        } else if(mark>=70) {
            System.out.println("Grade : C");
        } else if(mark>=60) {
            System.out.println("Grade : D");
        }else
            System.out.println("Grade : F");
    }
}
