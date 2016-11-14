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
        Arrays.sort(a);
        long dp[] = new long[n];
        int I[] = new int[k];                   // I and J holds indices in array a.
        int J[] = new int[n-k];
        // initialize different sets of I and J arrays to consist all possibilities
        if(k*2 > n)
            k = n-k;                // this doesn't affect anything; changes perspective to the other person
        for(int i = 0; i<k; i++) {
            I[i] = i + n/2 - k/2;               // greedy choice; 
        }
        int c = 0;
        for(int j=0; j<n; j++) {
            if(c!=k)
            if(j == I[c]) {
                c++;        // one index in array (I) checked; check next index
                continue;
            }
            J[j - c] = j;
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