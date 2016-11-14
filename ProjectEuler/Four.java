import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler004

public class Four {         // largest palindrome under 'n' (6 digit number)
    static boolean isPalindrome(int n){
        int[] digit = new int[6];
        digit[0] = n%10;
        digit[1] = (n/10) % 10;
        digit[2] = n/100 % 10;
        digit[3] = n/1000 % 10;
        digit[4] = n/10000 % 10;
        digit[5] = n/100000 % 10;
        if(digit[0] == digit[5] && digit[1] == digit[4] && digit[2] == digit[3])
            return true;
        else
            return false;
    }
    static void maxPalindrome(int n){
        n--;
        while(n>100000){
            if(isPalindrome(n)){
                for(int i=100; i<1000; i++){
                    if(n%i == 0 && n/i <1000){
                        System.out.println(n);
                        return;
                    }

                }
            }
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            maxPalindrome(n);
        }
    }
}
