package strings;

public class permutation {

	
	public static void permuteString(String beginningString, String endingString) {
	
		if(endingString.length()==1)
		{
			System.out.println(beginningString+endingString);
			return;
		}
		for(int i=0;i<endingString.length();i++)
		{
			String str=endingString.substring(0,i)+endingString.substring(i+1);
			permuteString(beginningString+endingString.charAt(i),str);
		}
	}
	public static void main(String[] args) {
		// TnODO Auto-generated method stub
			permuteString("", "ABC");
	}

}
