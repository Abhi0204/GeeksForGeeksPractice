public class Isfact {

	static int number = 0;

	public static boolean isfact(int x, int y) {
		

		if(x==1 && y==1)
			return true;
		else if(x==1 && y!=1)
			return false;
		if (number == 0)
			number = x;
		else
			number = number * x;

		if (number % y == 0)
			return true;
		return isfact(x - 1, y);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isfact(13, 156*11*10));

	}

}
