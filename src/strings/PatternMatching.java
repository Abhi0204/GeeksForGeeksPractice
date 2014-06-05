package strings;

//Naive Brute Force Approach Complexity->O(n^2)
public class PatternMatching {
	static int count;

	public static void findPattern(String str, String pattern) {

		System.out.println(str.length());
		int j = 0;
		boolean flag = false;
       int k=0;
		int index=0;
		int count=0;
		while(index<str.length())
		{
			
			count++;
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
		
		System.out.println(count);
		
		if(flag==false)
			System.out.println("Pattern not found");

	}
			
			
			/*if (str.charAt(i) == pattern.charAt(0)) {
				int k = 0;
				count = 0;
				j = i;
				while (k<pattern.length()) {
					
					if (str.charAt(j) == pattern.charAt(k)) {
						count++;
						j++;
						k++;
					}

					else
						break;

				}
				if (count == pattern.length()) {
					flag = true;
				}*/
			
			

		

		/*if (flag == true)
			System.out.println("Pattern Found");
		else
			System.out.println("Pattern not Found");*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findPattern("ABABAB","ABAB");
	}

}
