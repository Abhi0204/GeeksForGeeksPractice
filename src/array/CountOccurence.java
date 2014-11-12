package array;

public class CountOccurence {

	public void printoccurence(String str)
	{
		char[] arr=str.toCharArray();
		int i=0;
		int count=1;
		int j=1;
		while( i<arr.length)
		{
			if(arr[i]==arr[i+1])
				{count++;
			
				}
			else
			{
				arr[j]=(char)count;
				j=j+2;
				count=1;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
