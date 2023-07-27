package day2;

public class CurrencyConverter {
    public static void main(String[] args){
        int usd_value = 10;
        final int usd_exchange_rate_for_nepal = 132;
        int nepal_value = usd_value * usd_exchange_rate_for_nepal;


        System.out.println("Nepal value of  $" + usd_value + " = " + nepal_value);
    }
}
