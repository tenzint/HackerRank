import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler006

public class Six {              // Square Sum Difference
    static long getSumOfSquares(long n){
        long result = 0;
        for(long i=1; i<=n; i++){
            result += i*i;
        }
        return result;
    }
    static long getSquareOfSums(long n){
        long result = n * (n+1)/2;
        result *= result;           // square the sums
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sumO2 = getSumOfSquares(n);
            long o2Sum = getSquareOfSums(n);
            long result = Math.abs(sumO2 - o2Sum);
            System.out.println(result);
        }
    }
}
