package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class countOddoccur {

	
	public int finelementOddNoOftimes(String[] arr)
	{
		int number=0;
		for(int i=0;i<arr.length;i++)
		{
			
			number=number^Integer.parseInt(arr[i]);
		}
		return number;
	}
	public int finelementOddNoOftimesHashMap(String[] arr)
	{
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		for (String str : arr) {
			if (hash.containsKey(str))
				hash.put(str, hash.get(str) + 1);
			else
				hash.put(str, 1);
		}

		for (String str : hash.keySet()) {
			int value = hash.get(str);
			if (value%2!=0) {
				return Integer.parseInt(str);
			}

		}

		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		String input = inp.readLine();

		String[] arr = input.split(" ");
	
		
		countOddoccur count=new countOddoccur();
		System.out.println(count.finelementOddNoOftimesHashMap(arr));
		System.out.println("\n");
		System.out.println(count.finelementOddNoOftimes(arr));
		
	}

}
