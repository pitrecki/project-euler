package Task16;


//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//        What is the sum of the digits of the number 2^1000?


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pitrecki on 2016-10-03.
 */
public class Task16
{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BigInteger powResult = new BigInteger(String.valueOf(BigInteger.valueOf(2).pow(1000)));

        List<Integer> digitsList = new LinkedList<>();
        for (int i = 0; i < powResult.toString().length(); i++) {
            int digit = Integer.parseInt(powResult.toString().substring(i, i + 1));
            digitsList.add(digit);
        }

        long sum = 0;
        for (Integer digit : digitsList) {
            sum += digit;
        }

        long end = System.currentTimeMillis();
        System.out.println("Result : " + sum + "\nTime: " + (end - start)/1e3 + " s");
    }
}
