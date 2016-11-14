import java.io.*;
import java.util.*;

/*
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int t =0; t<tests; t++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int temp = 1;
            HashSet<Integer> result = new HashSet<Integer>();
            result.add(a*(n-1));
            while (temp < n) {
                int r = a*temp + b* (n-temp-1);
                result.add(r);
                temp++;
            }
            result.add(b*(n-1));
            TreeSet<Integer> sRes = new TreeSet<Integer>(result) ;
            for(Integer r : sRes) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}