package array;

public class kadaane {

	/**
	 * @param args
	 */
	
	public int findmaximumSum(int[] arr)
	{
		if(arr==null)
			return -111;
		
		int maxSum=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum<0)
				sum=0;
			if(sum>maxSum)
				maxSum=sum;
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={-3,-4,2,3,1,-2,2,14};

kadaane ks=new kadaane();
System.out.println(ks.findmaximumSum(arr));
	}

}
