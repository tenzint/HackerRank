import java.io.*;
import java.util.*;
public class Candies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rating[] = new int[n];
        long candy[] = new long[n];
        for(int i=0; i<n; i++) {
            rating[i] = in.nextInt();
            candy[i] = 1;               // each student gets at least 1 candy
        }
        if(n!=1) {
            for(int i=1; i<n-1; i++) {
                if (rating[i] > rating[i-1] && rating[i] > rating[i+1])
                    candy[i] = Math.max(candy[i-1], candy[i+1]) + 1;
                else if(rating[i] > rating[i-1])
                    candy[i] = candy[i-1] + 1;
                else if(rating[i] > rating[i+1]) {          // we need to look back
                    candy[i] = candy[i+1] + 1;
                    int prev = i-1;
                    /*
                    while(rating[prev] > rating[prev+1]) {
                        candy[prev] = Math.max(candy[prev], candy[prev+1] +1);
                        prev--;
                    }
                    */
                }
            }
            // look backward; got rid of while-loop on line 25. while-loop has a run-time error on test#11
            // On each minima, the candy[m] is guaranteed to be 1; acts as a reset to not affect others.
            for (int i=n-2; i>0; i--) {
                if (rating[i] > rating[i-1] && rating[i] > rating[i+1])
                    candy[i] = Math.max(candy[i-1], candy[i+1]) + 1;
                else if(rating[i] > rating[i-1])
                    candy[i] = candy[i-1] + 1;
                else if(rating[i] > rating[i+1])          
                    candy[i] = candy[i+1] + 1;
                   
            }
            if(rating[0] > rating[1])
                candy[0] = candy[1] + 1;
            if(rating[n-1] > rating[n-2])
                candy[n-1] = candy[n-2] + 1;
        }
        long total = 0;
        
        for(int i=0; i<n; i++) {
            total+= candy[i];
        }
        System.out.println(total);
    }
}