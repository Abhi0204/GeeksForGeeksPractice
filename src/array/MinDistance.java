package array;

public class MinDistance {

	/**
	 * @param args
	 */
	
	public static void findMinDistance(int[] arr,int x,int y )
	{
		int xIndex=-1;
		int yIndex=-1;
		int min=Integer.MAX_VALUE;
		int diff=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				xIndex=i;
				if(yIndex!=-1)
				{
					diff=Math.abs(yIndex-xIndex);
					if(min>diff)
						min=diff;
				}
			}
			else if(arr[i]==y)
			{
				yIndex=i;
				if(xIndex!=-1)
				{
					diff=Math.abs(yIndex-xIndex);
					if(min>diff)
						min=diff;
				}
			}
		}
		
		System.out.println(min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4,3};
           findMinDistance(arr, 3, 6);
	}

}
