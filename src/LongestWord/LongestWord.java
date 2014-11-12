package LongestWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) throws IOException
	{
		
	
		Trie tree=new Trie();
		int totalWords=0;
		@SuppressWarnings("resource")
	//Reading from the file , PRovide the file location on the command Line
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(input));
		String line = null;
		
		
		long startTime=System.currentTimeMillis();
		//Start reading words from the file and inserting into a trie
		while ((line = reader.readLine()) != null) {
		totalWords++;
		tree.insertWord(line);
		}
		System.out.println("Total Words are "+totalWords);
		
		tree.checkValidWordSuffix();
		long endtime=System.currentTimeMillis();
		System.out.println("Total Time Taken is "+(endtime-startTime)/1000+ " seconds");
	}
}
