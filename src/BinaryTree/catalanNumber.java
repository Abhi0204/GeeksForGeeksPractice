package BinaryTree;


public class catalanNumber {

	/**
	 * @param args
	 */
	public static int findCatalanNumber(int n)
	{
	
		int[] arr=new int[n+1];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int temp=arr[j-1]*arr[i-j];
				arr[i]=arr[i]+temp;
			}

		}
		
		return arr[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findCatalanNumber(6));
	
	}

}
