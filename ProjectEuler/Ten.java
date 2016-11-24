import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler010

public class Ten {                      // Summation of Primes
    static HashMap<Long,Long> sumOfPrimes(long n){
        HashSet<Long> primeNums = new HashSet<Long>();
        HashMap<Long,Long> sumMap = new HashMap<Long,Long>();
        
        // initialization
        primeNums.add((long)2);
        long sum = 2;               // prime number, 2, is added to sum
        sumMap.put((long)2, sum);
        for(long i=3; i<=n; i+=2){          // for optimization, ignore total sum at even number; handle it later
            boolean isPrime = true;
            for(long prime : primeNums){
                if(i%prime == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                sum+= i;
                primeNums.add(i);
            }
            sumMap.put(i, sum);
        }
        return sumMap;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long max = 0;
        long numArray[] = new long[t];
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            if(n > max)
                max = n;
            numArray[a0] = n;
        }
        HashMap<Long,Long> sumMap = sumOfPrimes(max);
        for(int a0 = 0; a0 < t; a0++){
            if(numArray[a0]%2 != 0 && numArray[a0] != 2)            // odd numbers; sum in the HashMap
                System.out.println(sumMap.get(numArray[a0]));
            else                                                    // even numbers; sum not in the hashmap
                System.out.println(sumMap.get((numArray[a0] - (long)1)));                
        }        
    }
}
