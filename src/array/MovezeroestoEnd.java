package array;

public class MovezeroestoEnd {

	public static void main(String [] args)
	{

		int [] elementsArray={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int count=0;
		int[] arr = new int[elementsArray.length];

		for(int i=0;i<elementsArray.length;i++)
		{
			if(elementsArray[i]!=0)
			{
				arr[count]=elementsArray[i];
				count++;
			}
		}

		for(int j=count;j<elementsArray.length;j++)
		{
			arr[count]=0;
		}

		for(int no:arr)
		{
			System.out.print(" "+no);
		}
	}
}