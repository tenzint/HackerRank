import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Eight {                // Largest product in a series

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            int max = 0;
            for(int i=0; i<n-k; i++){
                
                int product = Integer.parseInt(num.substring(i,i+1));
                int j;
                for(j=1; j<k; j++){
                    product *= Integer.parseInt(num.substring(i+j,i+j+1));
                }
                
                if(product > max)
                    max = product;
            }
            System.out.println(max);
        }
    }
}
