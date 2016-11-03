import java.io.*;
import java.util.*;

public class Subsequences {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        long count = 1;         // empty sequence
        
        count += n;             // all the single ones
        
        if(n > 1) {             // get all 2 elements sequences
            for (int i = 1; i<n; i++) {                 // found a pattern! 2:1, 3:3, 4:6, 5:10, 6:15
                count += i;
            }
            // get all the 3 elements or more sequences.
            for (int j=1; j<n; j++){
                int difference = a[j] - a[j-1];
                int lastNum = a[j-1];
                int sequence = 1;
                for (int i=j; i<n; i++) {
                    if(a[i] == lastNum + difference)
                }
            }
        }
        
        System.out.println(count);
    }
}