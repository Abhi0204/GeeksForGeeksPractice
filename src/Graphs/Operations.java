package Graphs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class Operations{

	public static HashMap<Node,ArrayList<Node>> adjacencyList=new HashMap<Node, ArrayList<Node>>();
	public HashSet<Node> visited=new HashSet<Node>();
    public HashMap<Node,HashSet<Node>> components=new HashMap<Node, HashSet<Node>>();

	public void addEdge(Node source,Node destination)
	{
		if(source==null||destination==null)
			return;

		if(adjacencyList.containsKey(source))
		{
			ArrayList<Node> list=adjacencyList.get(source);
			list.add(destination);
			adjacencyList.put(source,list);
		}
		else{

			ArrayList<Node> arr=new ArrayList<Node>();
			arr.add(destination);
			adjacencyList.put(source,arr);
		}

		if(adjacencyList.containsKey(destination))
		{
			ArrayList<Node> list=adjacencyList.get(destination);
			list.add(source);
			adjacencyList.put(destination,list);
		}
		else{

			ArrayList<Node> arr=new ArrayList<Node>();
			arr.add(source);
			adjacencyList.put(destination,arr);
		}
	}


	public void printEdges(HashMap<Node, ArrayList<Node>> graph)
	{
		Iterator<Node> iter=graph.keySet().iterator();

		while(iter.hasNext())
		{
			Node key=iter.next();
			ArrayList<Node> arr=graph.get(key);

			System.out.print(key.name+"->");
			for(Node neigbours:arr)
			{
				System.out.print(neigbours.name+" ");
			}
			System.out.println("\n");
		}
	}


	//count the number of nodes in a graph
	public int getTotalNodes(HashMap<Node, ArrayList<Node>> adjacencyList)
	{
		if(adjacencyList==null)
			return 0;

		HashSet<Node> nodes=new HashSet<Node>();
		Iterator<Node> iter=adjacencyList.keySet().iterator();

		while(iter.hasNext())
		{
			Node source=iter.next();

			ArrayList<Node> arr=adjacencyList.get(source);
			for(Node n:arr)
				nodes.add(n);
		}

		return nodes.size();
	}


	//do BFS

	public boolean BFS(Node source,Node destination)
	{
		if(source==null||destination==null)
			return false;
		Queue<Node> BFSQueue=new LinkedList<Node>();
		visited.add(source);
		BFSQueue.add(source);

		while(!BFSQueue.isEmpty())
		{
			Node temp=BFSQueue.peek();
			if(temp!=null)
			{
				ArrayList<Node> arr=adjacencyList.get(temp);
				for(Node edge:arr)
				{
					if(!visited.contains(edge))
					{
						if(edge==destination){
							visited.clear();
							return true;
						}
						else
						{	
							visited.add(edge);
							BFSQueue.add(edge);	
						}
					}
				}

				BFSQueue.remove();

			}
		}

		visited.clear();
		return false;
	}

	//do DFS

	public boolean DFS(Node source,Node destination)
	{
		if(source==null||destination==null)
			return false;

		Stack<Node> DFSStack=new Stack<Node>();

		visited.add(source);
		DFSStack.add(source);
		
		while(!DFSStack.isEmpty())
		{
			Node temp=DFSStack.peek();

			if(temp!=null)
			{

				ArrayList<Node> arr=adjacencyList.get(temp);
			
				for(Node edges:arr)
				{	
					if(!visited.contains(edges))
					{ 
						arr.add(edges);
						if(edges==destination){			
							visited.clear();
							return true;
						}
						else
						{
							DFSStack.pop();
							visited.add(edges);
							DFSStack.add(edges);
						}
					}
				}

			}
		}

		visited.clear();
		return false;
	}

	//Find components in a graph
	public void findTreeinAforest(HashMap<Node, ArrayList<Node>> adjacencyList)
	{
		if(adjacencyList==null)
			return;

		Queue<Node> BFSQueue=new LinkedList<Node>();

		Iterator<Node> iter=adjacencyList.keySet().iterator();
		int count=0;
		while(iter.hasNext())
		{
			Node temp=iter.next();
			BFSQueue.add(temp);
			
			//Check if the node is earlier visited in the previous component
			if(temp!=null && !visited.contains(temp))
			{
				count++;
				
				while(!BFSQueue.isEmpty()){
					Node node=BFSQueue.remove();
                   
                    
					if(!visited.contains(node)){
                      
						ArrayList<Node> arr=adjacencyList.get(node);

						for(Node edges:arr)
						{
							BFSQueue.add(edges);
						}

						visited.add(node);

					}
				}
			}
		}
		

		

		System.out.println("The number of components are "+count);

	}
	public static void main(String[] args) throws IOException {

		BufferedReader reader=new BufferedReader(new FileReader(new File("/home/abhinav/GraphDataSet")));
		//For input of file contents
		String line="";

		Operations graph=new Operations();
		//Reading input from the file and creating a graph

		Node source1=new Node("Boston");
		Node source2=new Node("Buffalo");
		Node source3=new Node("Akron");
		Node source4=new Node("Chicago");
		Node source5=new Node("NYC");
		Node source6=new Node("Miami");
		Node source7=new Node("LosAngeles");
		Node source8=new Node("LasVegas");
		Node source9=new Node("Detroit");
		Node source10=new Node("Michigan");
		Node source11=new Node("Syracuse");
		Node source12=new Node("SanJose");
		Node source13=new Node("SanFransciso");
		Node source14=new Node("Dallas");


		graph.addEdge(source13,source8);
		graph.addEdge(source8, source7);
		graph.addEdge(source12, source8);
		graph.addEdge(source12, source13);
		graph.addEdge(source2, source1);
		graph.addEdge(source2, source3);
		graph.addEdge(source3, source4);
		graph.addEdge(source4, source6);
		graph.addEdge(source5, source9);
		graph.addEdge(source5, source14);
		graph.addEdge(source5, source10);
		graph.addEdge(source10, source11);



		graph.printEdges(adjacencyList);

		//check BFS code
		System.out.println(graph.BFS(source14, source11));


		//check DFS Code
		System.out.println(graph.DFS(source14, source11));
		
		//check no of components
		graph.findTreeinAforest(adjacencyList);



	}
}