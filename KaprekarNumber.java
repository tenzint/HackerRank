import java.io.*;
import java.util.*;

public class KaprekarNumber {
    static boolean printIfKaprekar(int i){
        int d = 0;
        long temp = (long)i;
        while(temp != 0){       // try to get the digit of i
            temp /= 10;
            d++;
        }
        temp = (long)i * (long)i;
        if(temp % (long)Math.pow(10, (double)d) + temp / (long)Math.pow(10, (double)d) == (long)i){
            System.out.print(i + " ");
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        in.close();
        boolean foundK = false;             // No kaprikar number found at the beginning
        for (int i=p; i<=q; i++) {
            foundK = printIfKaprekar(i) || foundK;            
        }
        if(!foundK){
            System.out.println("INVALID RANGE");
        }
        System.out.println();
    }
}