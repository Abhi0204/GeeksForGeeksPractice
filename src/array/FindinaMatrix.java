package array;

public class FindinaMatrix {

	public boolean findMartix(int[][] arr,int number)
	{
		int i=0;
		int j=arr.length-1;
		
		while(i<arr.length && j>0)
		{
			if(number==arr[i][j])
				return true;
			else if(number>arr[i][j])
				i++;
			else if(number<arr[i][j])
				j--;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		int[][] mat = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		
		FindinaMatrix arr=new FindinaMatrix();
		System.out.println(arr.findMartix(mat,29));
	}
}
