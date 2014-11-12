import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MagicForest {
    /**
     * @param nodes Number of nodes in the magic forest. Nodes are numbered 0 .. nodes-1.
     * @param edges List of edges.
     */
// this stores the adjacency list of the graph
public ArrayList<ArrayList<Integer>> adjacencyList;
// this is the visited array of the graph
public boolean[] visited;
// this array stores the componenets of the graph
public ArrayList<ArrayList<Integer>> components;
// maintain an edge list
ArrayList<Edge> edgeList;
    public MagicForest(int nodes, List<Edge> edges) {
    edgeList = (ArrayList<Edge>) edges;
    adjacencyList = new ArrayList<ArrayList<Integer>>();
    visited = new boolean[nodes];
   
    for(int i = 0; i < nodes; ++i)
    adjacencyList.add(new ArrayList<Integer>());
   
    for(Edge e : edges){
    int fromVertex = e.getFrom();
    int toVertex = e.getTo();
   
    adjacencyList.get(fromVertex).add(toVertex);
    }
   
    visited = new boolean[nodes];
    for(int i = 0; i < nodes; ++i)
    visited[i] = false;
   
    components = new ArrayList<ArrayList<Integer>>();
   
    }

    public boolean checkGraph(ArrayList<Integer> component){
   
   
//System.out.println(component.size());
    int nEdges = 0;
   
    for(int i = 0; i < component.size(); ++i){
    for(int j = 0; j < component.size(); ++j){
    Edge e = new Edge(component.get(i), component.get(j));
   
    for(int k = 0; k < edgeList.size(); ++k){
    if(e.getFrom() == edgeList.get(k).getFrom() && e.getTo() == edgeList.get(k).getTo())
    ++nEdges;
    }
    }
    }
   
    if(nEdges >= component.size())
    return true;
   
    return false;
    }
    
    // this implements BFS
    public void doBFS(int sourceVertex){
   
    ArrayList<Integer> comp = new ArrayList<Integer>();
    comp.add(sourceVertex);
   
    if(!visited[sourceVertex])
    visited[sourceVertex] = true;
   
    Queue<Integer> frontier = new LinkedList<Integer>();
    frontier.add(sourceVertex);
   
    while(!frontier.isEmpty()){
   
    int source = frontier.peek();
    for(int i = 0; i < adjacencyList.get(source).size(); ++i){
    if(visited[adjacencyList.get(source).get(i)])
    continue;
    else{
    comp.add(adjacencyList.get(source).get(i));
    visited[adjacencyList.get(source).get(i)] = true;
    frontier.add(adjacencyList.get(source).get(i));
    }
    }
   
    frontier.remove();
    }
   
    components.add(comp);
    }
    public int countTrees() {
   
    int nTrees = 0;
   
    for(int i = 0; i < adjacencyList.size(); ++i){
    if(!visited[i]){
    ++nTrees;
    doBFS(i);
    }
    }
        
    for(int i = 0; i < components.size(); ++i){
    if(checkGraph(components.get(i)))
    --nTrees;
    }
   
    return nTrees;
    }

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge(1, 2));
        edges.add(new Edge(3, 4));
        edges.add(new Edge(3, 5));
        edges.add(new Edge(4, 5));
        edges.add(new Edge(6, 7));
        edges.add(new Edge(6, 8));
        edges.add(new Edge(6, 9));

        MagicForest magicForest = new MagicForest(10, edges);
        System.out.println(magicForest.countTrees());
    }
}

class Edge {
    private int from;
    private int to;

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}

