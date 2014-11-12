package Tries;

public class LongestSubstringMAin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mississipi";
		LongestSubstring longest=new LongestSubstring();
		for(int i=0;i<str.length();i++)
		{
			longest.createSuffixTree(str.substring(i));
		}
	}

}
