package array;

public class MAximumRepeatingNumber {


	public void findMAximumRepeatingNumber(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i]%arr.length;
			arr[temp]=arr[temp]+arr.length;
		}

		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max%arr.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};
		MAximumRepeatingNumber max=new MAximumRepeatingNumber();
		max.findMAximumRepeatingNumber(arr);

	}
	}
