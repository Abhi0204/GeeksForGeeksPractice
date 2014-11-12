package bitOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPowerOf2 {

	public static int nextPower(int n)
	{
		int p=1;
		if(n==0)
			return 2;
		if((n&(n-1))==0)
		return n;
		else
		{
			while(p<n)
			{
				p<<=1;
			}
	        return p;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(inp.readLine());
		System.out.println(nextPower(n));
		
	}

}
