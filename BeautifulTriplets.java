import java.io.*;
import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int result = 0;             // the number of beautiful triplets in the array of a difference of d
        
        for (int i = 0; i< n-2; i++) {
            int count = 1;
            int lastNum = a[i];
            for (int j = i+1; j<n && j <= i+d+d && count < 3; j++) {
                if(a[j] == lastNum + d) {
                    count++;
                    lastNum = a[j];
                }
            }
            if (count == 3)
                result++;
        }
        System.out.println(result);
    }
}