import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/university-codesprint/challenges/mini-max-sum
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num[] = new long[5];
        num[0] = in.nextLong();
        num[1] = in.nextLong();
        num[2] = in.nextLong();
        num[3] = in.nextLong();
        num[4] = in.nextLong();
        Arrays.sort(num);
        long minSum = num[0] +num[1] +num[2] +num[3];
        long maxSum = num[1] +num[2] +num[3] + num[4];
        System.out.println(minSum + " " + maxSum);
    }
}
