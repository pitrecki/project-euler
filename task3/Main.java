package task3;

//
//
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-09-07.
 */
public class Main
{
    public static void main(String[] args) {
        //BigInteger valueToDivide = new BigInteger("100000000000");
        int valueToDivide = 1000000000;
        BigDecimal testValue = new BigDecimal("600851475143");
        boolean[] resultArray = new boolean[valueToDivide];

        Arrays.fill(resultArray, true);
        resultArray[0] = resultArray[1] = false;

        for (int i = 2; i < resultArray.length; i++) {
            if (resultArray[i] == true) {
                for (int j = 2; i*j < resultArray.length; j++)
                    resultArray[i * j] = false;

            }
        }

        int i = 0;
        while (i < resultArray.length) {
            BigDecimal big = new BigDecimal(i);
            if (resultArray[i] == true)
                if (testValue.remainder(big) == BigDecimal.valueOf(0))
                    System.out.println(i);
            i++;
        }

    }
}
