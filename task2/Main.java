package task2;



//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


/**
 * Created by Pitrecki on 2016-09-07.
 */
public class Main
{
    public static int sumValue = 0;

    public static void main(String[] args) {

        int i = 1;
        long fibValue = fibbanacci(i);
        while (sumValue <= 4000000) {
            fibValue = fibbanacci(i);
            if (fibValue%2 == 0)
                sumValue += fibValue;

            i++;
        }

        System.out.println(sumValue);
    }

    public static long fibbanacci(long value) {
        if (value == 0)
            return 0;
        if (value == 1 || value == 2)
            return  1;

        long returnValue =  (fibbanacci(value - 1)  + fibbanacci(value - 2));


        return returnValue;

    }
}
