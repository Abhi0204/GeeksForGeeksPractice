package MAtrices;

public class CountMaxnosof1s {

	public int DoBinarySearch(int[][] arr,int low,int high,int row)
	{
		
		int middle=0;
		int lower=0;
		int higher=high;
		while(lower<=higher)
		{
		middle=(lower+higher)/2;
		
		
		if((middle==0 ) && arr[row][middle]==1)
			return middle;
		if(middle-1>=0)
			if(arr[row][middle-1]==0 && arr[row][middle]==1)
				return middle;
		
		else if(arr[row][middle]==0)
			lower=middle+1;
		else
			higher=middle-1;
		}
		
		return Integer.MAX_VALUE;
	}
	
	
	public void findMAximumNoof1(int[][] mat)
	{
		int rows=mat.length;
		int column=mat[0].length;
		int max=0;
		int indexRow=0;
		for(int i=0;i<rows;i++)
		{
			int index=DoBinarySearch(mat, 0, column-1,i);
			if(max<column-index)
			{
				max=column-index;
				indexRow=i;
			}
			}
		System.out.println(indexRow+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { {0, 0, 0, 1},
				{0, 1, 1, 1},
		        {0, 0, 1, 1},
		        {0, 0, 0, 0}
		        };
		
		CountMaxnosof1s count=new CountMaxnosof1s();
		count.findMAximumNoof1(mat);

		}

}
