package MAtrices;

public class SearchanElementin2DMatrix {

	/**
	 * @param args
	 */
	//Complexity O(m+n)
	public static boolean SearchanElement(int[][] arr,int key)
	{
		int i=0;
		int j=arr[0].length-1;
		int index;
		while(j>=0&&i<arr[0].length)
		{
			 index=arr[i][j];
			 if(index==key)
				 return true;
			if(key<index)
				j--;
			else
				i++;
				
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {1, 2, 3, 4},
				{5, 6, 7, 8},
		        {14, 18, 20, 22},
		        {24, 26, 30, 31
		        	}
		        };
		
		System.out.println(SearchanElement(mat,21));
		
	}

}
