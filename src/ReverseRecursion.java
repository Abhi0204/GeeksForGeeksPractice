
public class ReverseRecursion {

	static int i=0;
	public static String reverse(String str) {
	    if ((null == str) || (str.length()  <= 1)) {
	        return str;
	    }
	    System.out.println(str.substring(1) + str.charAt(0));
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse("Abhinav"));
	}

}
