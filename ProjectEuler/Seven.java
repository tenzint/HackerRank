import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler007

public class Seven {            // Nth Prime
    static HashMap<Integer,Long> primes = new HashMap<Integer,Long>();
    static void listPrime(int n){
        primes.put(1, (long)2);
        primes.put(2, (long)3);
        int count = 2;
        for(long num=5; count<=n; num += 2){
            boolean isPrime = true;
            for(long prime : primes.values()){
                if(num%prime == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                primes.put(count, num);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] amount = new int[t];
        int max = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            amount[a0] = n;
            if(n>max)
                max = n;
        }
        listPrime(max);
        for(int i=0; i<t; i++){
            System.out.println(primes.get(amount[i]));
        }
    }
}
