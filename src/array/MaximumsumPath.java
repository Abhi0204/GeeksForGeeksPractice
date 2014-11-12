package array;

public class MaximumsumPath {

	public void findMaximumSum(int[] arr,int[] arr1)
	{
		int i=0,j=0;
		int sum1=0,sum2=0;
		int maximumSum=0;

		while(i<arr.length && j<arr1.length)
		{
			
				sum1=sum1+arr[i];
				sum2=sum2+arr1[j];
			
				if(arr[i]==arr1[j])
				{
				maximumSum=maximumSum+Math.max(sum1, sum2);
				sum1=0;
				sum2=0;
				}
			

			i++;
			j++;
		}
		
		maximumSum=maximumSum+Math.max(sum1, sum2);
System.out.println(maximumSum);
		while(i<arr.length||j<arr1.length)
		{
			if(i<arr.length)
			{
				maximumSum=maximumSum+arr[i];
				i++;
			}
			else if(j<arr1.length)
			{
				maximumSum=maximumSum+arr1[j];
				j++;
			}
		}


		System.out.println(maximumSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int	ar1[] = { 10, 12}, ar2[] = {5, 7, 9};

		MaximumsumPath max=new MaximumsumPath();
		max.findMaximumSum(ar1, ar2);
	}

}
