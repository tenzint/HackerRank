import java.io.*;
import java.util.*;

public class AMC_ICPCteam {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet mems[] = new BitSet[n];
        for(int i=0; i<n; i++) {
            String mem = in.next();
            mems[i] = new BitSet(m);
            for (int j=0; j<m; j++) {
                if(mem.charAt(j) == '1')
                    mems[i].set(j);
            }
        }
        int max = 0;
        int maxCount = 0;
        // get through all possible teams; left member(i) - right member(j)
        for(int i=0; i<n-1; i++) {              // left member from index 0 to second last
            for(int j=i+1; j<n; j++) {          // right member from index 1 (initially) to last
                BitSet result = (BitSet)mems[i].clone();
                result.or(mems[j]);
                int val = result.cardinality();
                if (val > max) {
                    max = val;
                    maxCount = 1;
                } else if(val == max)
                    maxCount++;
            }
        }
        System.out.println(max + "\n" + maxCount);
        
    }
}