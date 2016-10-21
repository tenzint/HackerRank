import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 
 Task 
Given an n X m matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.

Input Format

The first line contains an integer, n, denoting the number of rows in the matrix. 
The second line contains an integer, m, denoting the number of columns in the matrix. 
Each line i of the n subsequent lines contains m space-separated integers describing the respective values filling each row in the matrix.


Output Format

Print the number of cells in the largest region in the given matrix.

Sample Input

4
4
1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 0
Sample Output

5
 
 
 */

public class DFSMaxRegion {
    
    static int getBiggestRegion(int[][] matrix) {
        int max = 0, count = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    count = DFSregion(matrix, i, j, 0);
                    max = (max >= count ? max : count);
                }
            }
        }
        return max;
    }
    static int DFSregion(int[][] grid, int i, int j, int count) {
        
        if(i<0 || i>= grid.length)
            return count;
        if(j<0 || j>= grid[0].length)
            return count;
        if(grid[i][j] == 0)
            return count;
        count++;
        grid[i][j] = 0;
        count = DFSregion(grid, i-1, j-1, count);
        count = DFSregion(grid, i-1, j, count);
        count = DFSregion(grid, i-1, j+1, count);
        count = DFSregion(grid, i, j-1, count);
        count = DFSregion(grid, i, j+1, count);
        count = DFSregion(grid, i+1, j-1, count);
        count = DFSregion(grid, i+1, j, count);
        count = DFSregion(grid, i+1, j+1, count);
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
