package bitOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPowerOf2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(inp.readLine());
		
		 int p = 1;
		    if ((n & (n - 1))==0)
		        System.out.println(n);
		    else
		    {
		    while (p < n) {
		        p <<=1;
		    }
		   System.out.println(p);
		    }
	}

}
