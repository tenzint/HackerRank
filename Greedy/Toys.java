import java.io.*;
import java.util.*;
/*
 * https://www.hackerrank.com/challenges/mark-and-toys
 */
public class Toys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextInt();
        long[] price = new long[n];
        for(int i=0; i<n; i++) {
            price[i] = in.nextLong();
        }
        Arrays.sort(price);         // quicksort in increasing order
        int count = 0;
        while(k>0 && count < n) {
            count++;
            k -= price[count];
        }
        System.out.println(count);
    }
}