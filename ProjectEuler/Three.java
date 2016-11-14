import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler003

public class Three {            // Largest Prime Factor
    static void largestPrime(long n) {
        long sqrtN = (long)Math.ceil(Math.sqrt((double)n));
        while (n%2==0)
            n/=2;
        if(n==1) {
            System.out.println(2);
            return;
        }
        long i;
        for(i=3; i<= sqrtN; i+=2) {
            while(n%i==0)
                n/=i;
            if(n==1){
                System.out.println(i);
                return;
            }
        }
        i -= 2;
        if(n>2)
            System.out.println(n);          // n has no smaller factors other than itself
        else
            System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            largestPrime(n);            
        }
    }
}
