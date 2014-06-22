package array;

public class InsertIntoSortedArray {

	public static void insert(int[] arr,int no)
	{
		int i=arr.length-1;
	while(i>=0 && arr[i]>no)
		i--;
	
	System.out.println(i);
	
	for(int j=arr.length-1;j>i;j--)
	{
		arr[j]=arr[j-1];
	}
	arr[i]=no;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr={1,3,5,12,13,14,17,21,25,29};
      
		insert(arr,6);
		
		for(int g:arr)
		{
			System.out.print(g+" ");
		}
	}

}
