package graphs.traversal;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rasn on 8/17/16.
 */
public class Graph {
    public int V;
    public List<Integer>[] adjacencyList;

    public Graph(int v){
        V =v;
        adjacencyList = new LinkedList[V];
        for(int i = 0 ; i < V ;i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        adjacencyList[source].add(destination);
    }

}
