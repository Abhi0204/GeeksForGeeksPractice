import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Graph {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file=new File("/home/abhinav/Path");
		BufferedReader buffReader=new BufferedReader(new FileReader(file));
		

		HashMap<String, HashSet<String>> Graph=new HashMap<String, HashSet<String>>();
		
		String line=null;
		while(line!=null)
		{
			String[] arr=line.split(":");
			
			
		}
	}

}
