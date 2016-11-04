# HackerRank
Some HackerRank problems that I enjoyed solving. Each java files are a mini-program that have their own classes and solve their own problems.



Interesting tricks:

to get a 1-digit integer from Scanner class individually: 
                Scanner in = new Scanner(System.in);
                String theRow = in.nextLine();
                grid[r][c] = Integer.parseInt(theRow.substring(c, c+1));
------------------ We can use theRow.charAt(c) to get a single character from Scanner (without using BufferedReader)!
