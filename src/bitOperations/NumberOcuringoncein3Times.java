package bitOperations;

public class NumberOcuringoncein3Times {

	/**
	 * @param args
	 */
	
	public static void getNumberonce(int[] arr)
	{
		int once=0;
		int twice=0;
		int thrice=0;
		
		for(int i=0;i<arr.length;i++)
		{
			twice|=once & arr[i];
			once=once^arr[i];
			thrice=~(once&twice);
			once=once&thrice;
			twice=twice&thrice;
		}
		
		System.out.println(once);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,1,2,1,3,3,3};
		getNumberonce(arr);
	}

}
