package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import javax.swing.JTable.PrintMode;

public class VerticalSum {
	
	HashMap<Integer,Integer> myMap=new HashMap<Integer, Integer>();
	static HashMap<Integer,ArrayList<Node>> printMap=new HashMap<Integer, ArrayList<Node>>();
    
	public void findVerticalSum(Node root,int index)
	{
		if(root==null)
			return;
		if(myMap.containsKey(index))
		{ myMap.put(index,myMap.get(index)+root.data);
		ArrayList<Node> ar=printMap.get(index);
		ar.add(root);
		printMap.put(index,ar);
		}
		else
		{myMap.put(index,root.data);
		ArrayList<Node> arr=new ArrayList<Node>();
		arr.add(root);
		printMap.put(index,arr );
		}
		findVerticalSum(root.leftChild, index-1);
		findVerticalSum(root.rightChild, index+1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		root.rightChild.leftChild.rightChild=new Node(9);
		root.rightChild.leftChild.leftChild=new Node(7);
		root.rightChild.rightChild=new Node(8);
		
		VerticalSum vertical=new VerticalSum();
		vertical.findVerticalSum(root,0);
		TreeMap<Integer, Integer> tree=new TreeMap<Integer, Integer>(vertical.myMap);
		//System.out.println(tree);
		TreeMap<Integer, ArrayList<Node>> treeMap=new TreeMap<Integer, ArrayList<Node>>(printMap);
		Iterator iter=treeMap.keySet().iterator();
		while(iter.hasNext())
		{
			int key=Integer.parseInt(iter.next().toString());
			ArrayList<Node> arr=treeMap.get(key);
			for(Node n:arr)
			{
				System.out.print(n.data+" ");
			}
			System.out.println("\n");
			
		}
		
		
	}

}
