package task12;


//The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
//
//        1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//        Let us list the factors of the first seven triangle numbers:
//
//        1: 1
//        3: 1,3
//        6: 1,2,3,6
//        10: 1,2,5,10
//        15: 1,3,5,15
//        21: 1,3,7,21
//        28: 1,2,4,7,14,28
//
//        We can see that 28 is the first triangle number to have over five divisors.
//
//        What is the value of the first triangle number to have over five hundred divisors?



/**
 * Created by Pitrecki on 2016-09-22.
 */
public class Main
{
   public static void main(String[] args) {
       long startApp = System.currentTimeMillis();
       int triangleValue = 0;
       //500/2 = 250 so 500 dividers, beacuse 2*250
       //250 * 2 = 500
       final int MAX_AM_OF_DIVISIOR = 250;

       for (int i = 1; ; i++) {
           triangleValue = (i*(i+1))/2;
           int actualyNumbOfDivisior = MAX_AM_OF_DIVISIOR;
           for (long z = 2; z * z<= triangleValue; z++){
               if (triangleValue%z == 0)
                   actualyNumbOfDivisior--;
           }
           if (actualyNumbOfDivisior <= 0)
               break;
       }
       long endApp = System.currentTimeMillis();
       long timeRunning = endApp - startApp;

       System.out.println(triangleValue);
       System.out.println(String.format("%.4f s",timeRunning / 1e3));
   }

}
