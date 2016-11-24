import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler009

public class Nine {                         // Special Pythagorean Triplets

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int max = -1;
            for(int a=1; a<n/2; a++){
                for(int b=a; b<n/2; b++){
                    int c = n-a-b;
                    if(c*c == a*a + b*b){
                        int product = a*b*c;
                        if(product>max)
                            max = product;
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
