package Task21;

import java.util.*;

/**

 Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

 For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

 Evaluate the sum of all the amicable numbers under 10000.

 * Created by Pitrecki on 2016-12-02.
 */
public class Task21
{
    private static final int MAX_NUMBER = 10000;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Set<Integer> integerHashSet = new HashSet<>();
        int number = 1;
        for (int i = 0; i < MAX_NUMBER; i++) {
            int f = solve(number);
            int s = solve(f);
            if (f != s && number == s) {
                integerHashSet.add(f);
                integerHashSet.add(s);
            }
            number++;
        }

        int sum = add(new ArrayList<>(integerHashSet));

        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum + "\nTotal time: " + (endTime - startTime)/1e3 + " s");

    }

    private static int solve(int number) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number%i == 0)
                integerList.add(i);
        }

        return add(integerList);
    }

    private static int add(List<Integer> list) {
        int sum = 0;
        for (int element : list)
            sum += element;

        return sum;

    }
}
