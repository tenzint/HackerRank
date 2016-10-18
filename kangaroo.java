import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        // x1 < x2
        if(v1<=v2)
            System.out.println("NO");
        
        /*else{
            while(x1<x2){
                x1 += v1;
                x2 += v2;
            }
            if (x1 == x2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/
        
        // needed to optimise to pass test cases
        /* 
        *
        * x1 + t v1 = x2 + t v2;        for an intersecting time, t, if this statement holds true, then print YES
        * x1 - x2 + t(v1 - v2) = 0
        * t(v1-v2) = x2 - x1                // x2 > x1 by constrain. v1 > v2, because if v1 <= v2, kangaroos will never meet
        * t = (x2 - x1) / (v1 - v2)
        * the remainder of the division needs to be 0...
        *
        * if (v1-v2) > (x2-x1), then kangaroo 1 (k1) overtakes k2 in 1 step
        */
        else{
            if ((x2 - x1) % (v1 - v2) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
