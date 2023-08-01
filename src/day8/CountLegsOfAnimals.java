package day8;

import java.util.Scanner;

public class CountLegsOfAnimals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int chickenLegs = 2;
        int cowLegs = 4;
        int pigLegs = 4;

        System.out.println("Enter the number of chicken, cow and pig in coma separated :");
        String countAnimal = scanner.nextLine();

        String[] arrayOfCountAnimal = countAnimal.split(",");

        int result =0;

        for (int i=0; i<arrayOfCountAnimal.length; i++){
            int intNumber = Integer.parseInt(arrayOfCountAnimal[i]);
            switch(i) {
                case 0:
                    result = result + (intNumber * 2);
                    break;
                case 1:
                    result = result + (intNumber * 4);
                    break;
                case 2:
                    result = result + (intNumber * 4);
                    break;
                default:
                    System.out.print("");
            }
            System.out.println("total count of legs =" + result);


            }
        }
    }

