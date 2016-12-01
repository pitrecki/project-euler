package task20;


//
//n! means n × (n − 1) × ... × 3 × 2 × 1
//
//        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//        Find the sum of the digits in the number 100!


import task15.PathFinder;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pitrecki on 2016-10-07.
 */
public class Task20
{
    public static void main(String[] args) {
        Task20 task20 = new Task20();
        String s = task20.factorial(new BigInteger("10")).toString();
        long sum = task20.sum(s);


        System.out.println("Result: " + s +"\nSuma: " + sum);
    }

    public BigInteger factorial(BigInteger value) {
        if (value.equals(BigInteger.ONE))
            return BigInteger.ONE;

        return factorial(value.subtract(BigInteger.ONE)).multiply(value);

    }

    public long sum(String s ) {
        long sum = 0;

//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < s.length(); i++) {
//            list.add(i, Integer.parseInt(s.substring(i, i+1)));
//        }
//
//        for (Integer element : list) {
//            sum += element;
//        }

//        char[] chars = s.toCharArray();
//        for (char element : chars) {
//            sum += Character.getNumericValue(element);
//        }

        for (int i = 0; i < s.length(); i++)
            sum += Integer.parseInt(s.substring(i, i+1));

        return  sum;
    }
}
