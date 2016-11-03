import java.io.*;
import java.util.*;

public class ServicLane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        // N different 'service segments'. T different test cases
        int N = in.nextInt();
        int T = in.nextInt();
        // the width (1-3) of each segments between 0 to N-1
        int width[] = new int[N];
        for(int i=0; i<N; i++) {            // scope of this variable i only in this for loop.
            width[i] = in.nextInt();
        }
        for(int test=0; test<T; test++) {   // unique i, j boundaries for each test cases
            int i = in.nextInt();
            int j = in.nextInt();
            // vehicle: 1 - motorbike, 2 - car, 3 - truck
            int vehicle = 3;                // Assume max, then becomes minimum width in the given i-j boundary
            for (int start=i; start <= j; start++) {
                if (width[start] < vehicle)
                    vehicle = width[start];
            }
            System.out.println(vehicle);
        }
    }
}