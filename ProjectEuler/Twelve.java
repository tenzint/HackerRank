import java.io.*;
import java.util.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler012

public class Twelve {               // Highly divisible triangular number
    static void nFactors(int n){
        int count = 0;
        int i = 1;
        int triangle = 0;
        
        while(count < n){
            triangle += i;
            i++;
            count = 0;
            for(int j=1; j<=triangle/2; j++){
                if(triangle%j==0){
                    count++;
                }
            }
            // we don't count the number itself (we count 1 as a factor)
            if(count >= n){
                System.out.println(triangle);
                return;
            }
        }
        if(count >= n){
            System.out.println(triangle);
            return;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- != 0){
            int n = in.nextInt();
            nFactors(n);
        }
    }
}