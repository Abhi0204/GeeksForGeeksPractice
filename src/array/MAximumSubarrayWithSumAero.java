package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MAximumSubarrayWithSumAero {

	/**
	 * @param args
	 */
	
	public static void printMaximumSubArrayWithSumZero(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}
		
		HashMap<Integer,ArrayList<Integer>> myMap=new HashMap<Integer,ArrayList<Integer>>();
	
		
		for(int i=0;i<arr.length;i++)
		{
			if(myMap.containsKey(arr[i]))
					{
				       ArrayList<Integer> list=myMap.get(arr[i]);
				       list.add(i);
				       myMap.put(arr[i], list);
					}
			else{
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(i);
				myMap.put(arr[i],list);
			}
		}
		
		
		Iterator iter=myMap.keySet().iterator();
		
		while(iter.hasNext())

		{
			int key=Integer.parseInt(iter.next().toString());
			ArrayList<Integer> myarr=myMap.get(key);
			if(myarr.size()>1)
			{
				int length=myarr.size();
				System.out.println(myarr.get(0)+1+"--"+myarr.get(length-1));
			}
		}

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0,1,-1,0};
		printMaximumSubArrayWithSumZero(arr);
	}

}
