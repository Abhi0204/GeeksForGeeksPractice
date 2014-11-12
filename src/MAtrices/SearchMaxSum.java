package MAtrices;

public class SearchMaxSum {
	
	static int largestSum=0;
	public void MaximumSum(int[][] mat,int row,int column,int sum)
	{
		if(row>mat.length-1)
			return;
		if(column>mat[0].length-1)
			return;
	
		sum=sum+mat[row][column];
		if(sum>largestSum)
			largestSum=sum;
		MaximumSum(mat, row+1, column,sum);
		
		MaximumSum(mat, row, column+1, sum);
		
		
	}
	
	public static void printPath(int[][] mat,int row,int column,String path)
	{		

		if(row>mat.length-1||column>mat[0].length-1)
			return;
		if(mat[row][column]==-1)
			return;
		if(row<0||column<0)
			return;
		
		path=path+mat[row][column]+"->";

		if(row==mat.length-1&&column==mat[0].length-1){
			System.out.println(path);
			return;
		}
		
		printPath(mat, row+1, column,path);
		printPath(mat, row, column+1, path);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { {1, 2, 3, 4,5},
				{6, -1, 8,9,-1},
		        {11, 12, -1, 14,15},
		        {16, 17, 18, 19,20
		        	}
		        };
	
		SearchMaxSum search=new SearchMaxSum();
		search.MaximumSum(mat,0,0,0);
		System.out.println(largestSum);
		
		printPath(mat,0,0,"");
	}

}
