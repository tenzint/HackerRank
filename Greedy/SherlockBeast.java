import java.io.*;
import java.util.*;
/*
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 * Basic instructions, given a number, 'n' signifying digits, find the max value
 * if it consists of 5's divisible by 3, and 3's divisible by 5
 * Greedy choice: get remainder of n modulus 3
 */
public class SherlockBeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int t=0; t<tests; t++) {            
            int n = in.nextInt();
            if (n<3 || n==4 || n==7) {
                System.out.println("-1");
                continue;
            }
            int rem3 = n % 3;
            if (n%3 == 0) {
                for (int i=0; i<n/3; i++) {
                    System.out.print("555");
                }
                System.out.println();
            } else if (n%3 == 2) {
                for (int i=0; i<n/3 - 1; i++) {
                    System.out.print("555");
                }
                System.out.print("33333");
                System.out.println();
            } else {                    // n%3 == 1
                for(int i=0; i<(n/3)-3; i++) {

                    System.out.print("555");
                }
                System.out.print("3333333333");
                System.out.println();
            }
        }
    }
}