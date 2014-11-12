
public class ReverseRecursion {

	public static void reverse(String str,int i) {
		
		if(i==str.length())
			return;
		reverse(str,i+1);
		System.out.print(str.charAt(i));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	reverse("Abhinav",0);
	}

}
