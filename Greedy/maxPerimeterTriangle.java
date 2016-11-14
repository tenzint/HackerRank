import java.io.*;
import java.util.*;
/*
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle
 * Given 3 <= n <= 50 different length values, find the maximum perimeter non-degenerate triangle
 * 
 * Greedy approach: 
 * sort length array, start from max side and get the first non-degenerate triangle
 */

public class maxPerimeterTriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long l[] = new long[n];
        for(int i=0; i<n; i++) {
            l[i] = in.nextLong();
        }
        in.close();
        Arrays.sort(l);
        int i;
        for(i=n-1; i>1; i--) {
            if (l[i] < l[i-1] + l[i-2]) {
                // found triangle
                System.out.println(l[i-2] + " " + l[i-1] + " " + l[i]);
                break;
            }
        }
        if(i==1)            // 
            System.out.println("-1");
    }
}