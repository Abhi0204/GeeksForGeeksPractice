package array;

public class threesumProblem {

	/**
	 * @param args
	 */
	
	public void findSum(int[] arr,int key)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				
				int index=findNumber(arr,key-sum);
				if(index!=-1)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[index]);
				}
				
			}
		}
	}
	
	public int findNumber(int [] arr,int key)
	{
		
		int low=0;
		int high=arr.length-1;
		int middle;
		
		while(low<=high)
		{
			middle=(low+high)/2;
			
			if(arr[middle]==key)
				return middle;
			else if(arr[middle]>key)
				high=middle-1;
			else
				low=middle+1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,4,5,-4,-3,9,11,3};
		threesumProblem three=new threesumProblem();
		three.findSum(arr, 8);
	}

}
