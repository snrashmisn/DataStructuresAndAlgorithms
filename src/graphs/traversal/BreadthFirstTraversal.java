package graphs.traversal;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by rasn on 8/17/16.
 */
public class BreadthFirstTraversal {

    public Graph graph;
    public List<Integer> visitList = new LinkedList<>();

    BreadthFirstTraversal(Graph graph){
        this.graph = graph;
    }

    public List<Integer> bfsTraversal(int source){
        boolean[] visted = new boolean[graph.V];
        Queue<Integer> queue = new ArrayDeque<>(graph.V);

        queue.add(source);
        visted[source] = true;
        int node;
        while(!queue.isEmpty()){
            node = queue.remove();
            visitList.add(node);

            graph.adjacencyList[node].stream().forEach(v -> {
                if(!visted[v]){
                    queue.add(v);
                    visted[v] = true;
                }
            });
        }
        return visitList;
    }
}
