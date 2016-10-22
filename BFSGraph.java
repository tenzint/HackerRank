import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
	Consider an undirected graph consisting of  nodes where each node is labeled from 
	to  and the edge between any two nodes is always of length . 
	We define node  to be the starting position for a BFS.

	Given  queries in the form of a graph and some starting node, , 
	perform each query by calculating the shortest distance from starting node 
	to all the other nodes in the graph. Then print a single line of  space-separated
	integers listing node 's shortest distance to each of the  other nodes 
	(ordered sequentially by node number); if  is disconnected from a node, 
	print  as the distance to that node.
	
	Sample Input

	2
	4 2
	1 2
	1 3
	1
	3 1
	2 3
	2
	Sample Output

	6 6 -1
	-1 6

 */
public class BFSGraph {
    static class Edge {
        int n1, n2;
        Edge(int first, int second){
            n1 = first;
            n2 = second;
        }
    }
    public static class Graph {
        int node[];                 // value contains shortest path from source to the node
        ArrayList<Edge> edges;
        public Graph(int size) {
            node = new int[size];
            for(int i = 0; i< size; i++) {
                //node[i] = -1;
                node[i] = Integer.MAX_VALUE;            // initialize distance to infinity
            }
            edges = new ArrayList<Edge>();
        }

        public void addEdge(int first, int second) {
            Edge temp = new Edge(first, second);
            edges.add(temp);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            
            LinkedList<Integer> queue = new LinkedList<Integer>();
            HashSet<Integer> visited = new HashSet<Integer>();
            queue.add(startId);
            
            node[startId] = 0;
            int curr = startId;
            
            while(queue.size() != 0){
                visited.add(curr);
                for(Edge edge : edges){
                    if (edge.n1 == curr){
                        if(visited.contains(edge.n2))
                            continue;
                        else{
                            queue.add(edge.n2);
                            node[edge.n2] = Math.min(node[edge.n2], node[curr] + 6);
                        }
                    }
                    
                    else if(edge.n2 == curr){
                        if(visited.contains(edge.n1))
                            continue;
                        else {
                            queue.add(edge.n1);
                            node[edge.n1] = Math.min(node[edge.n1], node[curr] + 6);
                        }
                    }
                }
                curr = queue.remove();
            }
            // replace infinity with -1
            for(int i = 0; i<node.length; i++) {
                if(node[i] == Integer.MAX_VALUE)
                    node[i] = -1;
            }
            return node;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
