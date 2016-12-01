package task15;

import java.math.BigInteger;

/**
 * Created by Pitrecki on 2016-10-03.
 */
public class PathFinder
{
    private BigInteger numerator;
    private BigInteger denominator;

    public PathFinder(BigInteger value) {
        this.numerator = value.multiply(BigInteger.valueOf(2));
        this.denominator = value;
    }

    private BigInteger factorial(BigInteger value) {
        if (value.equals(BigInteger.ONE))
            return BigInteger.ONE;

        return new BigInteger(String.valueOf(factorial(value.subtract(BigInteger.ONE)))).multiply(value);
    }

    public void computeResult() {
        this.numerator = factorial(numerator);
        this.denominator = factorial(denominator);

        BigInteger result = numerator.divide(denominator.multiply(denominator));

        System.out.println("Result: " + result);
    }
}
