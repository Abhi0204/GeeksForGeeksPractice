package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DistinctPairs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int line= Integer.parseInt(inp.readLine());
		String line1=(inp.readLine());

		String [] elementsArray=line1.split(" ");
		
		HashSet<Integer> uniqueHash=new HashSet<Integer>();

		for(int i=0;i<elementsArray.length;i++)
		{
			int number=Integer.parseInt(elementsArray[i]);
			uniqueHash.add(number);

		}
		int count=0;
		for(int i=0;i<elementsArray.length;i++)
		{
			if(uniqueHash.contains(Integer.parseInt(elementsArray[i])+line))
			{
				count++;
				System.out.println(elementsArray[i]+","+ (Integer.parseInt(elementsArray[i])+line));
			}

		}
		System.out.println("Count is  "+count);

	}

}
