package week3.day5;

public class SumDouble {
    public static int sumDouble(int a, int b){
        if(a ==b){
            return 2* (a+b);
        }else{
            return a+b;
        }
    }
    public static void main(String[] args){
        int result1 = sumDouble(1,2);
        int result2 = sumDouble(3,2);
        int result3 = sumDouble(2,2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
