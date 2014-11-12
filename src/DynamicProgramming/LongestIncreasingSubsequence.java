package DynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void findLIS(int[] arr)
	{
		int[] LIS=new int[arr.length];
		for(int k=0;k<arr.length;k++)
			LIS[k]=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(arr[i]>arr[j] && LIS[i]<LIS[j]+1)
				{
					LIS[i]=LIS[j]+1;
				}
			}
		}
		
		int max=0;
		for(int i=0;i<LIS.length;i++)
		{
			if(LIS[i]>max)
			{
				max=LIS[i]	;
			}
			
		}
		
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr={10,9,22,3,4,5,6,7,8,9,10,23,24};
	findLIS(arr);
		
	}

}
