import java.io.*;
import java.util.*;

/*
 * Game system: there is an evil forest with 'N' Mandragora guarding it, each with H(i) health points.
 * Garnet and her pet comes to defeat all mandragora's and get xp. Her pet has S=1 strength and P=0 xp points, initially.
 * Garnet's pet can:        a) eat any mandragora and increase S by 1, or
 *                          b) battle and defeat mandragora by S * H(i) xp points
 *
 * If Garnet can fight Mandragoras in any order, find the max xp Garnet's pet can get (for possible evolution)
 */
public class MandragoraXP {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t = 0; t < tests; t++) {
            int n = in.nextInt();
            long H[] = new long[n];
            long sum = 0;
            for (int i=0; i<n; i++) {
                H[i] = in.nextLong();
                sum += H[i];
            }
            Arrays.sort(H);             // quicksort/mergesort H in ascending order
            long dp[] = new long[n];
            dp[0] = sum;                // S = 1; P = sum
            long S=1, P=sum;
            int i;
            for(i=1; i<n; i++) {
                S++;
                P -= H[i-1];
                dp[i] = S * P;
                if (dp[i] < dp[i-1])            // found max xp
                    break;
            }
            
            System.out.println(dp[i-1]);
        }
    }
}