import java.io.*;
import java.util.*;

/*
 Little Timmy has n dollars and goes to a chocolate shop where each chocolate costs c dollars
 and there is a promotion where each m wrappers nets little Timmy a free chocolate.
 Find the total number of chocolates little Timmy can get each t trips, given the value for
 t, n, c, m.
 Constraints apply: 2<=m<=n;        1<=c<=n;        and all values being finite (less than 100,000 for example)
*/
public class ChocolateFeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();                   // number of trips
        for(int i=0; i<t; i++) {
            int n = in.nextInt();               // amount of dollars little Timmy has
            int c = in.nextInt();               // cost of chocolates (all chocolate has same cost)
            int m = in.nextInt();               // number of wrappers needed for an extra free chocolate; 2<=m<=n
            
            int initialNum = n/c;
            int temp = initialNum;
            int totalChocolate = initialNum;
            while (temp/m != 0) {
                totalChocolate += temp/m;
                temp = temp/m + temp%m;
            }
            System.out.println(totalChocolate);
        }
    }
}