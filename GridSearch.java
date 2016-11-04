import java.io.*;
import java.util.*;

public class GridSearch {
    // just a 'tester' method to see if my implementation of copying each integer in a row to the grid from console
    static void printGrid(int grid[][]) {
        for(int row=0; row<grid.length; row++) {
            for(int column=0; column <grid[0].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++) {
            int gridRows = in.nextInt();
            int gridColumns = in.nextInt();
            in.nextLine();                          // end of line left after gridColumns
            int grid[][] = new int[gridRows][gridColumns];
            
            for(int r=0; r<gridRows; r++) {
                String theRow = in.nextLine();
                for(int c=0; c<gridColumns; c++) {
                    grid[r][c] = Integer.parseInt(theRow.substring(c, c+1));
                }
            }
            // printGrid(grid);
            
            // get the r and c, the number of rows and columns of 2D pattern to search in the grid
            int rows = in.nextInt();
            int cols = in.nextInt();
            in.nextLine();
            int pattern[][] = new int[rows][cols];
            for(int r=0; r<rows; r++) {
                String theRow = in.nextLine();
                for(int c=0; c<cols; c++) {
                    pattern[r][c] = Integer.parseInt(theRow.substring(c, c+1));
                }
            }
            boolean done = false;
            // search for pattern in grid
            for (int r=0; r <= gridRows - rows && !done; r++) {
                for (int c=0; c <= gridColumns - cols && !done; c++) {
                    if(grid[r][c] == pattern[0][0]) {
                        // may have found it!!
                        boolean quit = false;
                        for (int ro = 0; ro < rows && !quit; ro++) {
                            for (int co = 0; co < cols && !quit; co++) {
                                if (grid[r+ro][c+co] != pattern[ro][co])
                                    quit = true;
                            }
                        }
                        if (quit != true)
                            done = true;
                    }
                }
            }
            if (done)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}