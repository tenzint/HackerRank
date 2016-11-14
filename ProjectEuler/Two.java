import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler002

public class Two {          // Even Fibonacci sums

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long num=0, temp0 = 0, temp1 = 1, evenSum = 0;
            while(num <= n) {
                num = temp0 + temp1;
                if (num>n)
                    break;
                temp0 = temp1;
                temp1 = num;
                if(num%2 == 0)
                    evenSum += num;
            }
            System.out.println(evenSum);
        }
    }
}
