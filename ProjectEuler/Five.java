import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler005

/*
 * version 1: counting down from n to 2; works only when 2 <= N <= 11
 * version 2: counting only the amount of prime factors using a HashMap<prime factor, power>
*/
public class Five {                         // Smallest multiple
    
    static void smallestMultiple(int n){
        HashMap<Integer, Integer> primes = new HashMap<Integer, Integer>();
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            int num = i, count = 0;
            for(Map.Entry<Integer,Integer> prime : primes.entrySet()){
                if(num%prime.getKey() == 0){
                    isPrime = false;
                    count = 0;
                    while(num%prime.getKey() == 0){
                        num /= prime.getKey();
                        count++;
                    }
                    if(prime.getValue() < count)
                        prime.setValue(count);
                }
            }
            if(isPrime){
                primes.put(num, 1);
            }
        }
        long product = 1;
        for(Map.Entry<Integer,Integer> entry : primes.entrySet()){
            product *= (long)Math.pow((double)entry.getKey(), (double)entry.getValue());
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
