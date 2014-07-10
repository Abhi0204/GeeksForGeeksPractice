package array;

public class arrayElementsAreConsecutive {

	public boolean checkConsecutive(int[] arr)

	{
	
		int min=getMin(arr);
		int max=getMax(arr);
		if(findRepetition(arr))
		{
			if(max-min+1==arr.length)
			return true;
		}
		
		return false;
	}
	
	public boolean findRepetition(int[] arr)
	{
		int min=getMin(arr);
		for(int i=0;i<arr.length;i++)
		{
		
			if(Math.abs(arr[i])-min>arr.length)
				return false;
				
			if(arr[Math.abs(arr[i])-min]<0)
			return false;
			
			arr[Math.abs(arr[i])-min]=-arr[Math.abs(arr[i])-min];
		}
		
		return true;
				
	}
	
	public int getMin(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	public int getMax(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,41,3,5};
		arrayElementsAreConsecutive arr1=new arrayElementsAreConsecutive();
		System.out.println(arr1.checkConsecutive(arr));
	}

}
