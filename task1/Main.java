package task1;

//Multiples of 3 and 5
//
//
//
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//        Find the sum of all the multiples of 3 or 5 below 1000.


/**
 * Created by Pitrecki on 2016-09-07.
 */
public class Main
{
    public static void main(String[] args) {
        int value = 1000;
        int sumOfMultiplies = 0;

        for (int i = 0; i < value; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                sumOfMultiplies += i;
            }
        }

        System.out.println(sumOfMultiplies);
    }
}
