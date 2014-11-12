import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class ExternalSort {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader buff1=new BufferedReader(new FileReader(new File("/home/abhinav/Documents/first.txt")));
		BufferedReader buff2=new BufferedReader(new FileReader("/home/abhinav/Documents/second.txt"));
		
		String temp=buff1.readLine();
		String temp2=buff2.readLine();
		FileWriter fw = new FileWriter(new File("/home/abhinav/Documents/abc.txt"));
	    BufferedWriter writer1 = new BufferedWriter(fw);
	    
	    while(temp!=null && temp2!=null)
		{
			if(Integer.parseInt(temp)>=Integer.parseInt(temp2))
			{
				System.out.println(temp2);
				writer1.append(temp2);
				temp2=buff2.readLine();
			}
			else if(Integer.parseInt(temp)<=Integer.parseInt(temp2))
			{
				
				writer1.append(temp);
				System.out.println(temp);
				temp=buff1.readLine();	
			}
		}
	    
	    fw.close();
	    writer1.close();
		
		while(temp!=null || temp2!=null)
		{
			if(temp!=null)
			{
				System.out.println(temp);
				temp=buff1.readLine();
			}
			else{
				System.out.println(temp2);
				temp2=buff2.readLine();
			}
		}

	}

}
