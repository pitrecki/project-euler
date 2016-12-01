package task30;


//
//Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
//
//        1634 = 14 + 64 + 34 + 44
//        8208 = 84 + 24 + 04 + 84
//        9474 = 94 + 44 + 74 + 44
//
//        As 1 = 14 is not a sum it is not included.
//
//        The sum of these numbers is 1634 + 8208 + 9474 = 19316.
//
//        Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.


/**
 * Created by Pitrecki on 2016-10-08.
 */
public class Task30
{
    public static final int MAX_VALUE = 1000000;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < MAX_VALUE; i++) {
            if (i == check(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Suma: " + sum);
    }

    public static int check(int value) {
        String s = Integer.valueOf(value).toString();
        int powSum = 0;
        for (int i = 0; i < s.length(); i++)
            powSum += Math.pow(Double.parseDouble(s.substring(i, i+1)), 5.);

        return  powSum;
    }
}
