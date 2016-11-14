import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler005

/*
 * Works only when 2 <= N <= 11
*/
public class Five {                         // Smallest multiple
    
    static void smallestMultiple(int n){
        long product = 1;
        
        Vector<Long> factors = new Vector<Long>();
        for(int i=n; i>1; i--){                 // ignore the factor of 1
            long factor = i;
            long count = 0;
            for(int j=0; j<factors.size(); j++) {
                if(factors.get(j)%factor == 0){
                    count++;
                    /*
                    if(count>1){
                        factors.set(j, factors.get(j)/factor);
                    }
                    */
                }
            }
            if(count==0){
                product *= (long)factor;
                factors.add(factor);
            } else if(count>1) {            // if count==1, then do nothing
                //if(isPrime(factor))
                     product /= (long)Math.pow(factor, count-1);
                
            }
            //System.out.println(product + " count: " + count + " factor: " + factor);
        }
        System.out.println(product);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            smallestMultiple(n);
        }
    }
}
