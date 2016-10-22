import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
	Note: java doesn't have "next_permutation()" method!!!
	This is a class program that does manual nextPermutation.
	
	Steps:
		- get a String from console
		- From right side, compare lexicographical value of a character with it's left part.
		- If it's left char (named "i - 1") has less value, then from right side of string, swap the first bigger character with "i - 1"
		- reverse the substring to the right of "i - 1"
		- combine the substring and you have the next permutation, if the string has one
 */
public class NextPermutation {
    static void printNextP(String s) {
        int i;
        for(i = s.length() - 1; i>0; i--) {             // start @ last letter; ignore the letter @ index 0
            if (s.charAt(i) > s.charAt(i-1)) {
                for (int j = s.length() - 1; j>=i; j--){
                    if(s.charAt(j) > s.charAt(i-1)) {
                        // swap s[j] and s[i-1]
                        String substr = s.substring(i-1);
                        char[] sub = substr.toCharArray();
                        char temp = sub[0];
                        sub[0] = sub[j - i+1];
                        sub[j - i+1] = temp;
                        
                        // reverse sub; sub[0] must not be reversed!!!!!!!!!!
                        
                        for(int k=1; k <= (sub.length - 1)/ 2 ; k++){
                            // swap char @ k and length - 1 - k
                            char temp2 = sub[k];
                            sub[k] = sub[sub.length - k];
                            sub[sub.length - k] = temp2;
                        }
                        substr = new String(sub);
                        
                        //System.out.println("substr ------- " + substr);
                        s = s.substring(0, i-1) + substr;
                        break;
                    }
                }
                
                break;
            }
        }
        if(i == 0)
            System.out.println("no answer");
        else
            System.out.println(s);
        return;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        for(int i = 0; i< n; i++) {
            s = in.next();
            printNextP(s);
        }
    }
}