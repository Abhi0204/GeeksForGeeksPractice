package array;

public class AdjacentMaxSum {

	public static void findMAxSum(int[] arr)
	{
		int incl=arr[0];
		int exc=0;
		int excNew=0;
		for(int i=1;i<arr.length;i++)
		{
			excNew=Math.max(incl, exc);
			incl=arr[i]+exc;
			exc=excNew;
		}
		
		System.out.println(Math.max(incl,exc));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,8,10,15,6,9,5};
		findMAxSum(arr);
	}

}
