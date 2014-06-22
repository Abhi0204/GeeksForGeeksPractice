package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MooreAlgorithm {
	
	public int getCandidate(String[] arr)
	{
		int count=1;
		int majority_index=0;
		
		for(int i=1;i<arr.length;i++)
		{
			
			
			if(arr[majority_index].equals(arr[i]))
			{
				count++;
				majority_index=i;
			}
			else
				count--;
			
			if(count==0)
			{
				majority_index=i;
				count=1;
			}
			
			
		}
		return majority_index;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		
		String[] arr=inp.readLine().split(" ");
		
		MooreAlgorithm moo=new MooreAlgorithm();
		System.out.println(arr[moo.getCandidate(arr)]);
	}

}
