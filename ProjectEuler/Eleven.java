import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler011

public class Eleven {                   // Largest Product in a grid

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int max = 0;
        for(int row=0; row <20; row++){
            for(int col=0; col<17; col++){
                int product = grid[row][col] * grid[row][col+1] * grid[row][col+2] * grid[row][col+3];
                if(product > max)
                    max = product;
            }
        }
        for(int row=0; row <17; row++){
            for(int col=0; col<20; col++){
                int product = grid[row][col] * grid[row+1][col] * grid[row+2][col] * grid[row+3][col];
                if(product > max)
                    max = product;
            }
        }
        for(int row=0; row <17; row++){
            for(int col=0; col<17; col++){
                int product = grid[row][col] * grid[row+1][col+1] * grid[row+2][col+2] * grid[row+3][col+3];
                if(product > max)
                    max = product;
            }
        }
        for(int row=0; row <17; row++){
            for(int col=3; col<20; col++){
                int product = grid[row][col] * grid[row+1][col-1] * grid[row+2][col-2] * grid[row+3][col-3];
                if(product > max)
                    max = product;
            }
        }
        
        System.out.println(max);
        
    }
}
