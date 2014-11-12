package LongestWord;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Trie {

	private Node root;
	int max = 0;
	int secondMax = 0;
	int validWords = 0;
	int totalWords = 0;
	String firstMax = "";
	String SecondMax = "";
	Queue<String> myQueue = new LinkedList<String>();
	int flag = 0;
HashSet<String> mySet=new HashSet<String>();
	public Trie() {
		root = new Node(' ');
	}

	// Function to insert in the trie, all the words
	public void insertWord(String word) {
		Node current = root;
		if (word.length() == 0) {
			current.marker = true;
			return;
		}
		returnPrefix(word);
		for (int i = 0; i < word.length(); i++) {
			if (current.child[word.charAt(i) - 'a'] == null)
				current.child[word.charAt(i) - 'a'] = new Node(word.charAt(i));
			current = current.child[word.charAt(i) - 'a'];
		}

		current.marker = true;
	}

	// Function to look for the word, check if the prefix exist
	public boolean SearchWord(String word) {
		Node current = root;
		for (int i = 0; i < word.length(); i++) {
			if (current.child[word.charAt(i) - 'a'] == null)
				return false;
			else
				current = current.child[word.charAt(i) - 'a'];
		}

		if (current.marker == true)
			return true;
		else
			return false;
	}

	// Function to check for valid suffixes
	public void checkValidWordSuffix() {
		while (!myQueue.isEmpty()) {
			String temp = myQueue.remove();
			String[] myarr = temp.split(",");

			returnSuffix(myarr[0], myarr[1]);

			if (SearchWord(myarr[1])) {
				
				mySet.add(myarr[0]);
				if (max < myarr[0].length()) {
					secondMax = max;
					SecondMax = firstMax;
					max = myarr[0].length();
					firstMax = myarr[0];

				}

			}
		}
		System.out.println("1st Longest Word: " + firstMax);
		System.out.println("2nd Longest Word: " + SecondMax);
		System.out.println("Total Valid Words: " + mySet.size());

	}

	// Function which returns the suffix of the existing word
	public void returnSuffix(String word, String suffix) {

		Node current = root;
		String result = "";
		for (int i = 0; i < suffix.length(); i++) {
			Node ch = current.child[suffix.charAt(i) - 'a'];
			if (ch == null)
				return;
			result = result + suffix.charAt(i);

			if (ch.marker == true) {

				if (!result.equalsIgnoreCase(suffix))
					myQueue.add(word
							+ ","
							+ suffix.substring(result.length(), suffix.length()));
			}

			current = ch;
		}

	}

	// Function which return the prefix of the existing word
	public String returnPrefix(String word) {
		Node current = root;
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			Node ch = current.child[word.charAt(i) - 'a'];
			if (ch == null)
				return result;
			result = result + word.charAt(i);

			if (ch.marker == true)
				myQueue.add(word.trim() + ","
						+ word.substring(result.length(), word.length()).trim());

			current = ch;
		}
		return result;
	}
}
