package day6;

public class LargestSmallest {
    public static void main(String[] args){

        int[] newArray = {5,3,8,9,4};
        int largest = newArray[0];
        int smallest = newArray[0];

        for (int i=0; i<newArray.length; i++){
            if(newArray[i]>largest){
                largest =newArray[i];
            }
            if(newArray[i]<smallest){
                smallest=newArray[i];
            }
        }
        System.out.println(" Largest: " + largest + " smallest: " + smallest);

    }
}
