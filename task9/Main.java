package task9;


//
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//        a2 + b2 = c2
//
//        For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.


/**
 * Created by Pitrecki on 2016-10-02.
 */
public class Main
{

    public static void main(String[] args) {
        System.out.println(solve(1000));

    }

    public static int solve(int s) {
        for(int m = 2; m < Integer.MAX_VALUE; m++) {
            for(int n = 1; n < m; n ++) {
                int a = m*m - n*n;
                int b = 2*m*n;
                int c = m*m + n*n;
                if(s % (a+b+c) == 0) {
                    int k = s / (a+b+c);
                    return k*a * k*b * k*c;
                }
            }
        }
        return -1;
    }



}
