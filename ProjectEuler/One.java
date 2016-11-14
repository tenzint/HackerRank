import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler001

public class One {                          // Multiples of 3 and 5

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            long threes = (n-1)/3, fives = (n-1)/5, fifteens = (n-1)/15;
            
            // summation of multiple of threes can be grouped in 3+6+9... = 3*(1+2+... )
            // (1+2+...+n) --- There is a summation formula for this: S(n) = n * (n+1) / 2
			// This changes for loop solutions, O(n/3 + n/5), to O(1)
            sum = 3 * threes * (threes+1) / 2 + 5*fives*(fives+1)/2 - 15*fifteens*(fifteens+1)/2;
            System.out.println(sum);
        }
    }
}
