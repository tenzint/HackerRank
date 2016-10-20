import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
    Consider an array of  integers, , where all but one of the integers occur in pairs. In other words, every element in  occurs exactly twice except for one unique element.

Given , find and print the unique element.

Input Format

The first line contains a single integer, , denoting the number of integers in the array. 
The second line contains  space-separated integers describing the respective values in .

Constraints

It is guaranteed that  is an odd number.
, where .
Output Format

Print the unique number that occurs only once in  on a new line.

Explanation 2 
We have two 0's, two 1's, and one 2. We print 2, because that's the only unique element in the array.

 */
public class LoneInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>(n);
        int num;
        for(int a_i=0; a_i < n; a_i++){
            num = in.nextInt();
            
            if (!a.containsKey(num))
                a.put(num, 1);
            else
                a.put(num, a.get(num) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: a.entrySet()){
            if(entry.getValue() % 2 == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
