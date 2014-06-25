package strings;

public class ReverseString {

	public static String printString(String str) {
		int j = str.length() - 1;
		int i = 0;
		char[] arr = str.toCharArray();

		while (i < str.length() / 2) {
			char temp = str.charAt(i);
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
		String result = "";
		for (char ch : arr) {
			result = result + ch;
		}
		return result;

	}
	
	public static void reverseRecurseString(String str,int index)
	{
		if(index==str.length())
			return;
		reverseRecurseString(str,index+1);
		System.out.print(str.charAt(index));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = printString("I am varun");

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) 
			System.out.print(printString(arr[i] + " "));
		
		System.out.println("\n");
		reverseRecurseString("I am Varun",0);

	}

}
