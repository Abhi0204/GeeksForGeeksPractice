package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		String str = inp.readLine();

		int[] arr = new int[256];

		for (int i = 0; i < str.length(); i++) {
			int count = str.charAt(i) - 'a';
			arr[count] = arr[count] + 1;
		}

		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				flag = 1;
				System.out.print(((char) ('a' + i)) + " " + "" + arr[i] + " ");
			}
		}

		if (flag == 0)
			System.out.println("No Duplicates Found");

		// finding the MAximum times occuring charactera
		/*
		 * for(int i=1;i<arr.length;i++) {
		 * 
		 * if(arr[i]>max) { max=arr[i]; index=i; } }
		 * System.out.println((char)(('a')+index));
		 */
		
		
		
		// Removing the Duplicates
		/*		
		String result="";
				  for(int i=0;i<arr.length;i++) {
				  
				 if(arr[i]==1)
				 
					 result=result+(char)('a'+i);
				
				 
				  }
				  System.out.println("\n");
				  System.out.println(result);*/
	}

}
