package array;

import java.util.Arrays;

public class MedianofSortedArray {

	
	public static int getMedian(int[] arr)
	{
		return arr[arr.length/2];
		
	}
	
	//complexity of Log(n)
	//Divide and conquer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1={1,12,15,26,38};
		int[] ar2={2,13,17,30,45};
		
		int resultMedian=0;
		while(true)
		{
			int median1=getMedian(ar1);
			int median2=getMedian(ar2);
			
			if(ar1.length==2&&ar2.length==2)
			{
				System.out.println(ar1[0]+","+ar1[1]+","+ar2[0]+","+ar2[1]);
				resultMedian=(Math.max(ar1[0],ar2[0])+Math.min(ar1[1],ar2[1]))/2;
				break;
			}
			
			if(median1<median2)
			{
				ar1=Arrays.copyOfRange(ar1,ar1.length/2,ar1.length);
				ar2=Arrays.copyOfRange(ar2,0,ar2.length/2+1);
			}
			else if(median1>median2)
			{
				ar2=Arrays.copyOfRange(ar2,ar2.length/2,ar2.length);
				ar1=Arrays.copyOfRange(ar1,0,ar1.length/2+1);
			}
			
			else
			{
				resultMedian=median1;
				break;
			}
			
		}
		System.out.println(resultMedian);
		
	}

}
