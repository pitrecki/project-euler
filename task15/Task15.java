package task15;


//
//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
//
//        How many such routes are there through a 20×20 grid?


import java.math.BigInteger;

/**
 * Created by Pitrecki on 2016-10-03.
 */
public class Task15
{
    //result is (2n)Cn  Dwumian Newtona

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new PathFinder(BigInteger.valueOf(Long.parseLong(args[0]))).computeResult();
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1e3 + " s");
    }
}
