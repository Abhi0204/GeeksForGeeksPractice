package PatternSearching;
public class BuildTrieSuffix {

	public static Node root;
	public BuildTrieSuffix()
	{
	 root=new Node(' ');
	}
	public void CreateSuffix(String str,String pattern)
	{
		String[] strArray=new String[str.length()];
		str=str.toLowerCase();
		pattern=pattern.toLowerCase();
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			strArray[i]=str.substring(i,str.length());
			CreateTreeSuffix(strArray[i],index);
			index++;
		}
		
		boolean flag=SearchForOccurence(pattern);
		
		if(flag)
		{	System.out.println("Pattern found");
		}

		else
			System.out.println("Pattern Not Found");
		
	}
	public void CreateTreeSuffix(String str,int index)
	{		
		Node current=root;
		for(int i=0;i<str.length();i++)
		{
			int indexPointer=str.charAt(i)-'a';
			if(current.NodeArr[indexPointer]==null)
				{
				current.NodeArr[indexPointer]=new Node(str.charAt(i));
				}
			current=current.NodeArr[indexPointer];
		}
		current.marker=true;
		
	}
	
	public boolean SearchForOccurence(String pattern)
	{
		if(pattern==null)
			return true;
		Node current=root;
		for(int i=0;i<pattern.length();i++)
		{
			int index=pattern.charAt(i)-'a';	
			if(current.NodeArr[index]==null)
				return false;
			
			current=current.NodeArr[index];
		}
		return true;
	}
}
