import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Hacker Rank - Algorithms - Implementations - Repeated Strings
 * By: Tenzin
 */
public class RepeatedStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int a_in_s =0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a')         // frequency of 'a' in s
                a_in_s++;
        }
        long count = n/ (long)s.length();
        long k =  n % (long)s.length();           // remainder
        int c=0;
        for(int i=0; i<k; i++){
            if(s.charAt(i) == 'a')
                c++;
        }
        System.out.println((long)a_in_s * count + c);
        /*
                       System.out.println(k);
                       System.out.println(s.length());
        System.out.println((float)a_in_s / (float)s.length());
        */
        
    }
}
