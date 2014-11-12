package array;

public class RotatedArrayFind {

	public void  findByHoemuchArrayisRotated(int[] arr,int high,int low)
	{
		int middle=0;
		int index=0;
		while(low<=high)
			{
			middle=(high+low)/2;
			if(arr[middle]<arr[middle-1])
			{
				index=middle-1;
				break;
			}
				
			else if(arr[middle]>arr[middle-1])
			{
				index=middle;
				break;
			}
			
			if(arr[low]>arr[middle])
				high=middle-1;
			else
				low=middle+1;
			
			}
		
		System.out.println(arr.length-index-1);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={5,6,7,8,9,1,2,3,4};
		RotatedArrayFind rotate=new RotatedArrayFind();
		rotate.findByHoemuchArrayisRotated(arr,arr.length,0);
	}

}
