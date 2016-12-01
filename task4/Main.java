package task4;



//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//        Find the largest palindrome made from the product of two 3-digit numbers.
//

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Pack200;

/**
 * Created by Pitrecki on 2016-09-07.
 */
public class Main
{
    public static void main(String[] args) {

        ArrayList<Integer> results = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                Integer tmp = i * j;
                buffer = buffer.append(tmp).reverse();
                if (tmp.toString().equals(buffer.toString())) {
                    results.add(tmp);
                    buffer.delete(0, buffer.length());
                }
                else {
                    buffer.delete(0, buffer.length());
                }
            }
        }

        int[] array = new int[results.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = results.get(i);
        }

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }



    }
}
