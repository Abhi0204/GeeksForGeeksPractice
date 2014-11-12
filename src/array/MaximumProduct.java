package array;

public class MaximumProduct {
	
	public static void getMaxProduct(int[] arr)
	{
		int min_endingHere=1;
		int Max_Sofar=1;
		int max_endinghere=1;
		for (int i=0;i<arr.length;i++)
		{
		if(arr[i]>0)
		{
			max_endinghere=max_endinghere*arr[i];
			min_endingHere=Math.min(min_endingHere *arr[i],1);
		}
		
		else if(arr[i]<0)
		{
			int temp=max_endinghere;
			max_endinghere=Math.max(min_endingHere*arr[i], 1);
			min_endingHere=temp*arr[i];
		}
		
		if(Max_Sofar<max_endinghere)
			Max_Sofar=max_endinghere;
		}
		
		System.out.println(Max_Sofar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={-3,2,1,5,6,1,-9};
		getMaxProduct(arr);
	}

}
