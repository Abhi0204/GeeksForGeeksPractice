package array;

public class FindDuplicates {

	public  static void printRepeating(int arr[], int size)
	{
	  int i;
	  System.out.println("The repeating elements are: \n");
	  for (i = 0; i < size; i++)
	  {
	    if (arr[Math.abs(arr[i])] >= 0)
	     arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	      
	    else
	    {
	      System.out.println(Math.abs(arr[i]));
	      arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
	    }
	  }
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 2, 1, 3, 3, 1, 6};
		  int arr_size = arr.length;
		  printRepeating(arr, arr_size);
		 
	}

}
