import java.io.*;
import java.util.*;

/**
 *
 * Maximal subset where any 2 numbers in Set of n numbers, are not divisible by k 
 * By Tenzin Thabkhae
 * Oct 13, 2016
 *
 * - Get n numbers, divide each numbers by k to get their remainder and count the frequency of the remainder in array of size k
 * - For each complements (3 and k-3 being a complement), get the bigger count (more frequent group)
 * - Add all max out of complements plus only 1 from when k = 0 (and k/2 if k is even)*. 
 * - The sum is the size of max subset
 */
public class MaxSubset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = 0;
        if (k==1){
            System.out.println("1");
            return;
        }
        int freq[] = new int[k];
        for (int i=0; i<n; i++){
            freq[(int)(in.nextLong() % (long)k)]++;
        }
        /*System.out.println("--------");
        for(int i=0; i<k; i++){
             System.out.println(freq[i]);
        }
         System.out.println("--------");
         */
        // int max declared already
        
        // k ==2 is a special case, but gets resolved along the way. No need for special attention
        for(int j=1; j < (k+1)/2; j++){              // skip k==0
            if(freq[j] >= freq[k-j])
                max += freq[j];
            else
                max += freq[k-j];
        }
        // System.out.println(max);
        if(freq[0] > 0)
            max++;
       // System.out.println(max);
        if(k%2 == 0){               // k is even. add 1 or 0 from k/2 frequency. Eg: if k = 8, remainder 4 will add up to 8
            // k == 2 is handled here
            if(freq[k/2] > 0)
                max++;
            // System.out.println("max");
        }
        System.out.println(max);
    }
}