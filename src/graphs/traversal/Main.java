package graphs.traversal;

/**
 * Created by rasn on 8/17/16.
 */
public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        BreadthFirstTraversal bfs = new BreadthFirstTraversal(g);
        System.out.println("bfs from 2 = " + bfs.bfsTraversal(2));

        DepthFirstTraversal dfs = new DepthFirstTraversal(g);
        System.out.println("dfs.dfsTraversal(2) = " + dfs.dfsTraversal(2));
    }
}
