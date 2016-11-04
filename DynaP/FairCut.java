import java.io.*;
import java.util.*;
import java.math.*;

public class FairCut {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long a[] = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextLong();
        }
        long dp[] = new long[n];
        int I[] = new int[k];                   // I and J holds indices in array a.
        int J[] = new int[n-k];
        // initialize different sets of I and J arrays to consist all possibilities
        for(int i=0; i<k; i++) {
            I[i] = i;
        }
        for(int j=n-k-1; j>=0; j--) {
            J[j] = j+k;
        }
        
        long unfair = 0;
        for(int i=0; i<k; i++) {
            for(int j=0; j<n-k; j++) {
                unfair += Math.abs(a[I[i]] - a[J[j]]);
            }
        }
        System.out.println(unfair);
    }
}