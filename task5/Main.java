package task5;



//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-09-08.
 */
public class Main
{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        boolean[] arrayToCompare = new boolean[20];
//        boolean[] resultArray = new boolean[20];
//        Arrays.fill(arrayToCompare, true);

        int number = 2520;
        int index = 0;
        int flag = 0;

        final int maxFlax = 20;

        while (number < 232792561) {
//            for (int i = 1; i <= 20; i++) {
//                if (number%i == 0) {
//                    resultArray[index] = true;
////                    flag++;
//                    index++;
//                }
//            }
            while (index >= 0 && index < 20) {
                while (number % (index + 1) ==0)
                    flag++;
//                if (number % (index + 1) == 0) {
////                    resultArray[index] = true;
//                    flag++;
//                }
                index++;
            }
            if (maxFlax == flag)
                System.out.println(number);
            number++;
            index = 0;
            flag = 0;
//            Arrays.fill(resultArray, false);

        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime / 1e3);
    }
}