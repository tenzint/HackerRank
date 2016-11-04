import java.io.*;
import java.util.*;
import java.math.*;
/*
 * Modified Fibonacci defined by: 
 * t(i+2) = t(i) + t(i+1)^2
 
 * Constraints: 0<= t1, t2 <=2
 *              3 <= n <= 20
 * t(n) becomes over 64-bit long. I had to familiarize with BigInteger class under math package
 */
public class FibonacciModified {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        
        BigInteger dp[] = new BigInteger[n];
        
        dp[0] = BigInteger.valueOf(t1);
        dp[1] = BigInteger.valueOf(t2);
        for(int i=2; i<n; i++) {
            dp[i] = dp[i-2].add(dp[i-1].multiply(dp[i-1]));
        }
        System.out.println(dp[n-1]);
    }
}