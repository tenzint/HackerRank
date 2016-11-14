import java.io.*;
import java.util.*;

/*
https://www.hackerrank.com/challenges/grid-challenge
*/
public class GridChallenge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t=0; t<tests; t++) {
            int n = in.nextInt();
            char G[][] = new char[n][n];
            for(int i = 0; i<n; i++) {
                String iRow = in.next();
                for(int j=0; j<n; j++) {
                    G[i][j] = iRow.charAt(j);
                }
                Arrays.sort(G[i]);              // Make a greedy assumption that using the available operation, we can sort rows
            }
            boolean isSorted = true;            // initially assume to be sorted
            for(int i=1; i<n && isSorted; i++) {
                for(int j=0; j<n && isSorted; j++) {
                    if(G[i][j] < G[i-1][j])
                        isSorted = false;
                }
            }
            if(isSorted)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}