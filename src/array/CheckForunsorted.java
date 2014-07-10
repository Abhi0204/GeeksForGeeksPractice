package array;

public class CheckForunsorted {

	
	public static void findUnsortedIndex(int [] arr)
	{
		int min=Integer.MAX_VALUE;
		int max=0;
		for(int i =0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				if(i<min)
					min=i;
				else
					max=i+1;
			}
		}
		
		System.out.println("Range is from "+min+" to "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
	
    findUnsortedIndex(arr);
	}

}
