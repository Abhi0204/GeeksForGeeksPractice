package array;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A={2,8,13,15,20};
		int[] B={5,7,9,25};
		
		int i=0;
		int j=0;
		int k=0;
		
		int [] c=new int[A.length+B.length];
		
		
		while(i<A.length)
		{
		
			if(i==A.length ||j==B.length)
				break;
			
			if(A[i]>=B[j])
			{
				c[k]=B[j];
				k++;
				j++;
			}
			else
			{
				c[k]=A[i];
				k++;
				i++;
			}
			
			
			
		}
		while(i<=A.length-1 || j<=B.length-1)
		{
			if(i==A.length)
			{
				c[k]=B[j];
				k++;
				j++;
			}
			else
			{
				c[k]=A[i];
				k++;
				i++;
			}
		}
		
		for(int str:c)
		{
			System.out.print(str+",");
		}
	}

}
