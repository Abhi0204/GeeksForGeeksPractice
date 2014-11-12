package strings;

public class SpaceElimination {

	/**
	 * @param args
	 */
	public static  void replaceSpace(String str)
	{
		
		
		char[] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count++;
				int j=i;
				while(j<arr.length-1)
				{
					arr[j]=arr[j+1];
					j++;
				}
			}
		}
		for(int i=arr.length-1;i>=arr.length-count;i--)
		{
			arr[i]=' ';
		}
		for(char c:arr)
			System.out.print(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Abhinav Bhardwaj is good";
         replaceSpace(str);
	}

}
