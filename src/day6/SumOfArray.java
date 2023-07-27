package day6;

public class SumOfArray {
    public static void main(String[] args){
        int[] num = {5,2,7,4,2};
        int sum =0;

        for(int i = 0; i<num.length; i++)
        {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
