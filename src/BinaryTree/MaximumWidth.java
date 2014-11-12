package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {

	public int getWidth(Node root)
	{
		int max=1;
		int hieght=getHieght(root);

		for(int i=1;i<hieght;i++)
		{
			int width=(findWidth(root,i));
			if(width>max)
				max=width;
		}
		return max;

	}

	public int findWidth(Node root,int level)
	{
		if(root==null)
			return 0;

		if(level==1) 
			return 1;

		else


			return findWidth(root.leftChild, level-1)+findWidth(root.rightChild, level-1);



	}

	public int getMAximumWidth(Node root)
	{
		if(root==null)
			return 0;

		Queue<Node> myQueue=new LinkedList<Node>();
		int count=0;
		int max_count=0;
		Node temp=root;
		myQueue.add(temp);
		myQueue.add(null);

		while(!myQueue.isEmpty())
		{
			temp=myQueue.remove();
			if(temp==null)
			{
				if(!myQueue.isEmpty())
				myQueue.add(null);
				if(max_count<count)
					max_count=count;
				count=0;
			}
			else 
			{
				count++;
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);
			}
		}
		
		return max_count;
	}

			public int getHieght(Node root)
			{
				if(root==null)

					return 0;

				int leftDepth=getHieght(root.leftChild);
				int rightDepth=getHieght(root.rightChild);

				if(leftDepth>rightDepth)
					return leftDepth+1;
				else
					return rightDepth+1;
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

				MaximumWidth max=new MaximumWidth();
				System.out.println("Maximum Width of the tree is "+max.getWidth(root));
				System.out.println(max.getMAximumWidth(root));
			}

		}
