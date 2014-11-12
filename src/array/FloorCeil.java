package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorCeil {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int line= Integer.parseInt(inp.readLine());
		
		String[] arr=inp.readLine().split(" ");
		
		int low=0;
		int high=arr.length-1;
		int middle=0;
		
		
		while(low<=high)
		{
			middle=(low+high)/2;
			
			if(Integer.parseInt(arr[middle])>line&&Integer.parseInt(arr[middle-1])<line)
			{

				System.out.println("Floor value= "+arr[middle-1]);
				System.out.println("Ceil Value=" +arr[middle]);
				return;
			}
			
			else if(Integer.parseInt(arr[middle])<line&&Integer.parseInt(arr[middle-1])>line)
			{

				System.out.println("Floor value= "+arr[middle]);
				System.out.println("Ceil Value=" +arr[middle-1]);
				return;
			}
			
			else if(Integer.parseInt(arr[middle])>line)
			{
				high=middle-1;
			}
			else
				low=middle+1;
				
		}
		
	}

}
