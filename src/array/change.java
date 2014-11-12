package array;

public class change {

	/**
	 * @param args
	 */
	
	public static void changeArray(int[] arr)
	{
		for(int i=1;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		
		for(int i:arr)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={0,1,2,-1,-2,-3};
changeArray(arr);
	}

}
