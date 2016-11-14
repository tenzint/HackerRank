import java.io.*;
import java.util.*;

/*
 * https://www.hackerrank.com/challenges/cavity-map
 */
class IJpairs {
    int i;
    int j;
    IJpairs(int _i, int _j) {
        i = _i;
        j = _j;
    }
}
public class CavityMap {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[] = new String[n];
        for (int i =0; i<n; i++) {
            a[i] = in.next();
        }
        int count = 0;
        Map<Integer, IJpairs> ij = new HashMap<Integer, IJpairs>(n/2);
        for (int i=1; i< n-1; i++) {
            for (int j=1; j<n-1; j++) {
                if(a[i].charAt(j) > a[i].charAt(j+1) && a[i].charAt(j) > a[i].charAt(j-1) && 
                  a[i].charAt(j) > a[i+1].charAt(j) && a[i].charAt(j) > a[i-1].charAt(j) ){
                    IJpairs ijTemp = new IJpairs(i,j);
                    ij.put(count, ijTemp);
                    count++;
                }
            }
        }
        
        for (Map.Entry<Integer, IJpairs> entry: ij.entrySet()) {
            int i = entry.getValue().i;
            int j = entry.getValue().j;
            // System.out.println(i + " " + j);
            a[i] = a[i].substring(0,j) + "X" + a[i].substring(j+1);
        }
        for (int i=0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
}