import java.io.*;
import java.util.*;
// https://www.hackerrank.com/challenges/equality-in-a-array

public class EqualizeArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> a = new HashMap<Integer, Integer>(n/2);
        int num;
        for(int i=0; i<n; i++){
            num = in.nextInt();
            if(a.containsKey(num)){
                a.put(num, a.get(num) + 1);
            } else
                a.put(num, 1);
        }
        in.close();
        int maxEqual = 1;
        for(Integer value : a.values()){
            if(value > maxEqual)
                maxEqual = value;
        }
        int numDeletion = n-maxEqual;
        System.out.println(numDeletion);
    }
}