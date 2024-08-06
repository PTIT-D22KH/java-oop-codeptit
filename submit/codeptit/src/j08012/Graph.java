package j08012;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Graph {
    private int nV, nE;
    private Map<Integer, Set<Integer>> edges  = new HashMap<>();
    public Graph(int nV, int nE) {
        this.nV = nV;
        this.nE = nE;
    }
    public Map<Integer, Set<Integer>> getEdges() {
        return edges;
    }


    
}
