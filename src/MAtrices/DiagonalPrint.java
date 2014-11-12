package MAtrices;

public class DiagonalPrint {

	/**
	 * @param args
	 */
	
	public static void printDiagonalElements(int[][] mat)
	{
		int i=0;
		int index;
		int j=0;
		while(i<mat.length)
		{
			index=i;
			while(index>=0&&j<mat[0].length)
			{
				System.out.print(mat[index][j]+" ");
				index--;
				j++;
			}
			i++;
			j=0;
			System.out.println("\n");
		}
		
	
		j=1;
		while(j<mat[0].length)
		{
			i=mat.length-1;
			index=j;
			while(i>=0 &&index<mat[0].length)
			{
				System.out.print(mat[i][index]+" ");
				i--;
				index++;
			}
			System.out.println("\n");
			j++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {1, 2, 3, 4,5},
				{6, 7, 8,9,10},
		        {14, 18, 20, 22,34},
		        {24, 26, 30, 31,66
		        	}
		        };
		printDiagonalElements(mat);
	}

}
