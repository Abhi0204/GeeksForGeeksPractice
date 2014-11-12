package SuffixTree;

import java.util.ArrayList;
import java.util.HashMap;

public class Build {

	
	SuffixTreeNode suffixNode=new SuffixTreeNode();
	
	public Build(String string)
	{
		for(int i=0;i<string.length();i++)
		{
			String suffix=string.substring(i);
			suffixNode.insertString(suffix, i);
		}
	}
	
	class SuffixTreeNode{
		HashMap<Character,SuffixTreeNode> children=new HashMap<Character, Build.SuffixTreeNode>();
		char value;
	
		ArrayList<Integer> indexes=new ArrayList<Integer>();
		
		public void insertString(String s,int index)
		{
			indexes.add(index);
			if(s!=null && s.length()>0)
			{
				value=s.charAt(0);
				
				SuffixTreeNode child=null;
				if(children.containsKey(value))
				{
					child=children.get(value);
				}
				else
				{
					 child=new SuffixTreeNode();
					
				}
				
			}
			
		}
	}
}

