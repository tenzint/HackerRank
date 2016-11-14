import java.io.*;
import java.util.*;

/*
 * https://www.hackerrank.com/challenges/luck-balance
 */
public class luckBalance {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int total = 0;              // total luck to be calculated
        int lst[] = new int[n];
        int lSize = 0;
        // L, T of each N pre-tests
        for (int i=0; i<n; i++) {
            int l = in.nextInt();
            int t = in.nextInt();
            if (t == 0)
                total += l;
            else if (t == 1) {
                lst[lSize] = l;
                lSize++;
            } 
        }
        Arrays.sort(lst, 0, lSize);             // sort in ascending order
        for (int i = lSize-1; i>= 0; i--) {
            // Greedy approach: fail k tests with highest luck values
            if(k>0) {
                k--;
                total+= lst[i];
            } else {                // k==0
                total -= lst[i];
            }
        }
        System.out.println(total);
    }
}