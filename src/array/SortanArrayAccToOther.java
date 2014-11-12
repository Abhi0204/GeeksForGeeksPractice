package array;

import java.util.HashMap;
import java.util.TreeMap;

public class SortanArrayAccToOther {

	public int[] sortarray(int[] arr, int[] arr2) {
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (myMap.containsKey(i)) {
				myMap.put(i, myMap.get(i) + 1);
			} else
				myMap.put(i, 1);
		}

		int j = 0;
		int i = 0;
		int k=0;
		while (j < arr2.length &&i<arr.length) {
			int index = 0;
			if(myMap.containsKey(arr2[j]))
			{
				k = myMap.get(arr2[j]);
			myMap.remove(arr2[j]);
			while (index < k) {
				arr[i] = arr2[j];
				i++;
				index++;
			}
			}
			j++;
			
		}		

		TreeMap<Integer, Integer> myTreeMap = new TreeMap<Integer, Integer>(
				myMap);
		java.util.Iterator<Integer> iter = myTreeMap.keySet().iterator();

		while (iter.hasNext() && i < arr.length) {
			 k = iter.next();
			int count = myTreeMap.get(k);
			int index = 0;
			while (index < count) {
				arr[i] = k;
				i++;
				index++;
			}
		
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2,1,3};
		SortanArrayAccToOther sort = new SortanArrayAccToOther();
		int[] arr = sort.sortarray(A1, A2);
		for (int i : arr)
			System.out.print(i + " ");
	}

}
