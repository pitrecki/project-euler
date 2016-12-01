package task10;


//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//        Find the sum of all the primes below two million.


import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-09-08.
 */
public class Main
{
    public static void main(String[] args) {
        int maxNumberToCompare = 2000000;
        long sum = 0;

        boolean[] array = new boolean[maxNumberToCompare];
        Arrays.fill(array, true);
        array[0] = array[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == true) {
                for (int j = 2; j *i < array.length; j++) {
                    array[i * j] = false;
                }
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
