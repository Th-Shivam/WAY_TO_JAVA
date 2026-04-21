import java.util.*;

class Graph {
    private int V; // Nodes ki sankhya
    private LinkedList<Integer> adj[]; // Adjacency List

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Graph mein edge add karne ke liye
    void addEdge(int v, int w) {
        adj[v].add(w); // Directed graph ke liye
    }

    // DFS helper function (Recursive)
    void DFSUtil(int v, boolean visited[]) {
        // Current node ko visited mark karein aur print karein
        visited[v] = true;
        System.out.print(v + " ");

        // Saare adjacent nodes ko check karein
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // Main DFS function
    void DFS(int v) {
        // Default saare nodes non-visited hote hain
        boolean visited[] = new boolean[V];

        // Helper function call karein
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal (starting from vertex 2):");
        g.DFS(2);
    }
}
