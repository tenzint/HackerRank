import java.io.*;
import java.util.*;

public class InstaFibonaci {
    final static double sqrtFive = 2.2360679775;
    
    static long getFibo(long n) {
        double A = (1 + sqrtFive) / 2;
        double B = (1 - sqrtFive) / 2;
        double fib = (Math.pow(A, n) - Math.pow(B, n)) / sqrtFive;
        return (long)(Math.floor(fib));				// other compilers might need ceiling function
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for(int i=0; i<20; i++) {
            long fib = getFibo(i);
            System.out.println(fib);
        }
    }
}