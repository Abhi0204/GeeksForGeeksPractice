package array;

import java.util.ArrayList;



public class MergeKSortedArray{


	static int heapArrIndex=1;
	static int newArrayIndex=0;
	static int oldArrayIndex=0;
	static int[] heapArr;
	static  int[] newArray;


	public MergeKSortedArray(int k,int length)
	{
		newArray=new int[k*(length-1)];
		heapArr=new int[k+1];
	}

	public void mergeArrays(Integer[] arr0,Integer[] arr1,Integer[] arr2,Integer[] arr3,int k)
	{
		 int i=0;
         int j=0;
       
         ArrayList<Integer[]> arrList=new ArrayList<Integer[]>();
         arrList.add(arr0);
         arrList.add(arr1);
         arrList.add(arr2);
         arrList.add(arr3);

		while(j<=k)
		{
			while(i<k)
			{
				Integer[] arr=arrList.get(i);
				createHeap(arr[j]);
				i++;
			}
			i=0;
			j++;
		}
	}

	public void createHeap(int number){
		if(heapArrIndex==heapArr.length)
		{
			for(int j=1;j<heapArrIndex;j++)
			{
				//System.out.println(heapArr[j]);
				newArray[newArrayIndex++]=heapArr[j];
			}

			heapArrIndex=1;
		}
		if(heapArrIndex<heapArr.length)
		{
			heapArr[heapArrIndex]=number;
			Heapify();
			heapArrIndex++;

		}
	}

	public void Heapify()
	{
		int index=heapArrIndex;
		int parentIndex=index/2;

		while(index>1 && heapArr[parentIndex]>heapArr[index])
		{
			int temp=heapArr[index];
			heapArr[index]=heapArr[parentIndex];
			heapArr[parentIndex]=temp;

			index=parentIndex;
			parentIndex=index/2;
		}
	}


	public static void main(String[] arr)
	{
		Integer [] arr0={-1,4,8,10,11};
		Integer [] arr1={-3,6,9,12,14};
		Integer [] arr2={0,5,6,18,19};
		Integer [] arr3={1,2,3,14,15};



		MergeKSortedArray merge=new MergeKSortedArray(4,arr3.length);
		merge.mergeArrays(arr0, arr1, arr2, arr3, 4);
		for(int i:newArray)
			System.out.println(i);
		}

}