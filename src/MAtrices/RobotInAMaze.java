package MAtrices;

public class RobotInAMaze {

	/**
	 * @param args
	 */
	
	public int findallPAth(int[][] arr,int low,int high,String path)
	{
		if(low>arr.length-1)
			return 0;
		if(high>arr[0].length-1)
			return 0;
		if(low==arr.length-1 && high==arr[0].length-1)
		{
			return 1;
		}
		return findallPAth(arr, low+1, high,path+arr[low][high]+" ")+
		findallPAth(arr, low, high+1,path+arr[low][high]+" ");
	}
	
	public int findallPAthDP(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
			arr[i][0]=1;
		for(int i=0;i<arr[0].length;i++)
			arr[0][i]=1;
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<arr[0].length;j++)
			{
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
		
		return arr[arr.length-1][arr[0].length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { {0, 0, 0, 1,1,1,1,1,1,1,1,1,1,1},
				        {0, 1, 1, 1,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 1, 1,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1},
		                {0, 0, 0, 0,1,1,1,1,1,1,1,1,1,1}
		        };		
		RobotInAMaze robot=new RobotInAMaze();
		
		long start=System.currentTimeMillis();
		//System.out.println(robot.findallPAth(mat,0,0,""));
		long end=System.currentTimeMillis();
		
		System.out.println((end-start)/1000);
		
		
		long stat=System.nanoTime();
	 System.out.println(robot.findallPAthDP(mat));

		long ed=System.nanoTime();
		
		System.out.println((ed-stat));


	}

}
