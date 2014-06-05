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
		int floor=0;
		int ceil=0;
		
		
		while(low<=high)
		{
			middle=(low+high)/2;
			if(Integer.parseInt(arr[middle])==line)
			{
				floor=Integer.parseInt(arr[middle-1]);
				ceil=Integer.parseInt(arr[middle+1]);
				break;
			}
			
			else if(line<Integer.parseInt(arr[middle]))
			{
				if(Integer.parseInt(arr[middle-1])<line)
				{
					floor=Integer.parseInt(arr[middle-1]);
					ceil=Integer.parseInt(arr[middle	]);
					break;
				}
				else
					high=middle-1;
			}
			else if(line>Integer.parseInt(arr[middle]))
			{
				if(Integer.parseInt(arr[middle+1])>line)
				{
					floor=Integer.parseInt(arr[middle]);
					ceil=Integer.parseInt(arr[middle+1]);
					break;
				}
				else
					low=middle+1;
			}
		}
		
		System.out.println("Floor value= "+floor);
		System.out.println("Ceil Value=" +ceil);
	}

}
