import java.io.*;
import java.util.*;

public class Abbreviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int que = in.nextInt();
        for (int q =0; q< que; q++) {
            String a = in.next();
            String b = in.next();
            if(b.length()>a.length()){
                System.out.println("NO");           // we can't operate on b
                continue;
            }
            int j=0, i;
            boolean quit = false;           // a flag needed at line#26
            for(i=0; i<a.length()&&j<b.length() && !quit; i++) {
                if(b.charAt(j) == a.charAt(i) || b.charAt(j) == a.charAt(i) + 'A' - 'a') {      // found a matching letter
                    j++;
                    continue;
                }
                if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {     // this current letter is neither matching nor a deletable one
                    // we found a lower case letter in string 'a' matching b before; do we have the actual uppercase letter here?
                    if (j>0 && b.charAt(j-1) == a.charAt(i))
                        continue;
                    System.out.println("NO");
                    quit = true;
                }
            }
            while(i < a.length() && !quit) {
                if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                    // we found a lower case letter in string 'a' matching b before; do we have the actual uppercase letter here?
                    if(b.charAt(j-1) == a.charAt(i)) {
                        i++;
                        continue;
                    }
                    System.out.println("NO");
                    quit = true;
                }
                i++;
            }
            if(!quit) {
                if(j == b.length())             // we traversed through b string completely
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}