package task6;


//
//The sum of the squares of the first ten natural numbers is,
//        12 + 22 + ... + 102 = 385
//
//        The square of the sum of the first ten natural numbers is,
//        (1 + 2 + ... + 10)2 = 552 = 3025
//
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


/**
 * Created by Pitrecki on 2016-09-08.
 */
public class Main
{
    public static void main(String[] args) {
        long sumOfSquares = 0;
        long sumOfNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            double someVal = Math.pow(i, 2.0);
            sumOfSquares += someVal;
            sumOfNumbers += i;
        }

        double powerOfSummedNumbers = Math.pow(sumOfNumbers, 2.0);

        System.out.println((long) powerOfSummedNumbers - sumOfSquares);

    }
}
