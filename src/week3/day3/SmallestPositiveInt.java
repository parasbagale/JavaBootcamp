package week3.day3;

public class SmallestPositiveInt {
    public static void main(String[] args){
        int []array = {-2, 0, 3 ,4, 2, 9};//input array

        int result = findSmallestPositiveInt(array); //call the function

        System.out.println("the smallest positive intiger is : " + result);
    }
    //function to find the smallest positive integer in an array

    public static int findSmallestPositiveInt(int[] array){
        int smallestPositiveInt = 1; //initialized to 1.

        for(int i=0; i<array.length; i++){
            if(array[i] > 0 && array[i] <= smallestPositiveInt){
                smallestPositiveInt=array[i]; //update if positive smallest integer found
            }
        }
        return smallestPositiveInt;
    }
}
