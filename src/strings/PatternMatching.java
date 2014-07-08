package strings;

//Naive Brute Force Approach Complexity->O(n^2)
public class PatternMatching {
	static int count;

	public static void findPattern(String str, String pattern) {

		int j = 0;
		boolean flag = false;
       int k=0;
		int index=0;
		while(index<str.length())
		{
			
			if(str.charAt(index)==pattern.charAt(k))
			{
				k++;
				index++;
			}
			else
			{
				index=index-(k-1);
				k=0;
			}
			if(k==pattern.length())
			{
				flag=true;
				System.out.println("Pattern found at index "+ (index-pattern.length()));
				index=index-(k-1);
				k=0;
			}
			
			
		}
				
		if(flag==false)
			System.out.println("Pattern not found");

	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findPattern("ABABABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAB","ABAB");
	}

}
