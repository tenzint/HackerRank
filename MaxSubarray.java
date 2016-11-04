import java.io.*;
import java.util.*;

/*
 * Outputs the maximum sum of both a contiguous array (harder) and a non-contiguous array (easy)
 */

public class MaxSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t=0; t<tests; t++) {
            long Nmax = Integer.MIN_VALUE;
            int iCmax = 0;                       // index of max contiguous sum
            long NCsum = 0, contSum = 0;
            int n = in.nextInt();
            int a[] = new int[n];
            long maxCont[] = new long[n];
            for (int i=0; i<n; i++) {
                a[i] = in.nextInt();
                // managing max non-contiguous subarray sum
                Nmax = Math.max(Nmax, a[i]);
                if (a[i] > 0)
                    NCsum += a[i];
                // managing max contiguous subarray sum
                if (a[i] >= 0) {
                    maxCont[iCmax] += (long)a[i];
                } else {                        // a[i] < 0, a negative number
                    if (iCmax==0 && maxCont[iCmax] == 0)
                        continue;           // skip this iteration...
                    else {
                        if (maxCont[iCmax] > 0)     // save the last iteration as a checkpoint 
                            iCmax++;
                        if (maxCont[iCmax-1] + (long)a[i] >= 0)
                            maxCont[iCmax] = maxCont[iCmax-1] + (long)a[i];
                    }
                }
            }
            for (int i=0; i<= iCmax; i++) {
                contSum = Math.max(contSum, maxCont[i]);
            }
            if(NCsum ==0) {
                NCsum = Nmax;
                contSum = Nmax;
            }
            System.out.println(contSum + " " + NCsum);
        }
    }
}