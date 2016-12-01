package task25;


//The Fibonacci sequence is defined by the recurrence relation:
//
//        Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
//
//        Hence the first 12 terms will be:
//
//        F1 = 1
//        F2 = 1
//        F3 = 2
//        F4 = 3
//        F5 = 5
//        F6 = 8
//        F7 = 13
//        F8 = 21
//        F9 = 34
//        F10 = 55
//        F11 = 89
//        F12 = 144
//
//        The 12th term, F12, is the first term to contain three digits.
//
//        What is the index of the first term in the Fibonacci sequence to contain 1000 digits?


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Pitrecki on 2016-10-08.
 */
public class Task25
{
    public static void main(String[] args) {
//        BigInteger index = new BigInteger("1");
        int index = 1;
        final BigDecimal phi = new BigDecimal(String.valueOf(((1 + Math.sqrt(5)) / 2)));
        final BigDecimal oneMinusPhi = BigDecimal.ONE.subtract(phi);
        final BigDecimal denumerator = new BigDecimal(String.valueOf(Math.sqrt(5)));
        do {
//            BigInteger fib = fibonacci(index);
            BigInteger fib = goldenProportion(index, phi, oneMinusPhi, denumerator);
            if (fib.toString().length() >= 1000) {
                System.out.println(index + ": " + fib);
                break;
            }

//            index = index.add(BigInteger.valueOf(1));
            index++;
        }
        while (true);
    }

    public static BigInteger fibonacci(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
            return BigInteger.ONE;

        return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(BigInteger.valueOf(2))));
    }

    public static BigInteger goldenProportion(int n, BigDecimal phi, BigDecimal oneMinusPhi, BigDecimal denumerator) {
//        BigDecimal phi = new BigDecimal(String.valueOf(((1 + Math.sqrt(5)) / 2)));
//        BigDecimal oneMinusPhi = BigDecimal.ONE.subtract(phi);
//        BigDecimal denumerator = new BigDecimal(String.valueOf(Math.sqrt(5)));
//

//        BigInteger result = phi.pow(n).subtract(oneMinusPhi.pow(n)).divide(denumerator).toBigInteger();

        return phi.pow(n).subtract(oneMinusPhi.pow(n)).divide(denumerator).toBigInteger();
    }
}
