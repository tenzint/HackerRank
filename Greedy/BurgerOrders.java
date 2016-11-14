import java.io.*;
import java.util.*;
/*
https://www.hackerrank.com/challenges/jim-and-the-orders
*/

public class BurgerOrders {
    static void compare() {
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> fans = new HashMap<Integer, Integer>();
        for(int i=1; i<=n; i++) {
            int endTime = in.nextInt()+in.nextInt();
            fans.put(i, endTime);
        }
        List<Map.Entry<Integer, Integer>> id = new LinkedList<Map.Entry<Integer, Integer>>(fans.entrySet());
        Collections.sort(id, (o1,o2) -> (o1.getValue()).compareTo(o2.getValue()));
        for (Map.Entry entry : id) {
            System.out.print(entry.getKey() + " ");
        }
    }
}