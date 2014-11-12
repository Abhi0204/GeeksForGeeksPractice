package DynamicProgramming;

public class LCS {

	/**
	 * @param args
	 */
	
	public void LCSCompute(String str,String str1)
	{
		int[][] arr=new int[str.length()+1][str1.length()+1];
		
		for(int i=0;i<arr[0].length;i++)
		{
			arr[0][i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i][0]=0;
		}
		
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<arr[0].length;j++)
			{
				if(str.charAt(i-1)==str.charAt(j-1))
				{
					arr[i][j]=arr[i-1][j-1]+1;
				}
				else
					arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
			}
		}
		System.out.println(arr[str.length()][str1.length()]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABDEFG";
		String str1="ADFG";
		
		LCS lcs=new LCS();
		lcs.LCSCompute(str, str1);
	}

}
