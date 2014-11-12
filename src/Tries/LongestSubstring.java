package Tries;

import java.util.HashSet;

import javax.naming.spi.DirStateFactory.Result;

public class LongestSubstring {

	static Node root=new Node(' ');
	public void createSuffixTree(String str)
	{
		Node current=root;
		String res="";

		for(int i=0;i<str.length();i++)
		{
			int temp=str.charAt(i)-'a';
			
			if(current.children[temp]==null)
			{
				Node node=new Node(str.charAt(i));
				current.children[i]=node;
				current=current.children[i];
			}
			else
			{
				str=str+current.children[temp].letter;
				if(current.marker==true)
					System.out.println(res);
			}
			
			
		}
		
		current.marker=true;
	}
	
}