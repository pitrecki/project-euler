package task14;



//The following iterative sequence is defined for the set of positive integers:
//
//        n → n/2 (n is even)
//        n → 3n + 1 (n is odd)
//
//        Using the rule above and starting with 13, we generate the following sequence:
//        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//
//        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//        Which starting number, under one million, produces the longest chain?
//
//        NOTE: Once the chain starts the terms are allowed to go above one million.


import javax.management.relation.RoleList;
import java.util.*;

/**
 * Created by Pitrecki on 2016-10-01.
 */
public class Main
{
    public static int  MAXIMAL_NUMBER = 1000000;

    public static void main(String[] args) {
        List<Long> sequenceList = new LinkedList<>();
        long start = System.currentTimeMillis();
        int currentNumber = 13;
        int chainSize = 0;
        String strSequence = null;
        for (; currentNumber < MAXIMAL_NUMBER; currentNumber++){
            long n = currentNumber;

            do {
                if (sequenceList.isEmpty())
                    sequenceList.add((long) currentNumber);


                if (n % 2 == 0) {
                    n /= 2;
                }
                else if (n % 2 == 1)
                    n = n * 3 + 1;

                sequenceList.add(n);
            }
            while (n > 1);

            if (sequenceList.size() > chainSize) {
                chainSize = sequenceList.size();
                strSequence = sequenceList.toString();
            }
            sequenceList.removeAll(sequenceList);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Sekwencja liczb: " + strSequence + "\nLiczba elementow: " + chainSize + "\nCzas wykonywania programu: " + (finish - start)/1e3 + " s");
    }
}
