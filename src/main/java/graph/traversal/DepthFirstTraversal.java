package main.java.graph.traversal;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rasn on 8/17/16.
 */
public class DepthFirstTraversal {
    public Graph graph;
    public List<Integer> visitList = new LinkedList<>();

    DepthFirstTraversal(Graph graph){
        this.graph = graph;
    }

    public List<Integer> dfsTraversal(int s){
        boolean[] visited = new boolean[graph.V];
        dfsUtils(s, visited);
        return visitList;
    }

    private void dfsUtils(int node, boolean[] visited){
        visitList.add(node);
        visited[node] = true;
        graph.adjacencyList[node].stream().forEach(v -> {
            if(!visited[v]) dfsUtils(v, visited);
        });
    }
}
