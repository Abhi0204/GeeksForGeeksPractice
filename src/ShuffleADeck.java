
public class ShuffleADeck {

	/**
	 * @param args
	 */
	
	public static void shuffleDeck(int[] arr)
	{
		int temp=0;
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			index=(int)(Math.random()*(arr.length-i));
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		
		for(int i:arr)
			System.out.print(i+"");
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,4,5};
		
		shuffleDeck(arr);
	

	}

}
