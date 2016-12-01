package task7;


//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?


import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-09-08.
 */
public class Main
{
    public static void main(String[] args) {
        int valueToDivide = 100000000;
        boolean[] resultArray = new boolean[valueToDivide];

        Arrays.fill(resultArray, true);
        resultArray[0] = resultArray[1] = false;

        for (int i = 2; i < resultArray.length; i++) {
            if (resultArray[i] == true) {
                for (int j = 2; i*j < resultArray.length; j++)
                    resultArray[i * j] = false;

            }
        }

        int index = 1;
        int i = 0;
        while (index < 10002) {
            if (resultArray[i] == true) {
                System.out.println(index + ". " + i);
                index++;
            }
            i++;
        }


    }
}
