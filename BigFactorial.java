import java.io.*;
import java.util.*;
import java.math.*;

public class BigFactorial {
    static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        while(n>0) {
            result = result.multiply(BigInteger.valueOf((long)n));
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger result = factorial(n);
        System.out.println(result);
    }
}