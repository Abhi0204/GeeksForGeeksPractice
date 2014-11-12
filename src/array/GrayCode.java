package array;

public class GrayCode {

	public static int grayCheck(byte term1,byte term2)
	{
		
		System.out.println(term1);
		System.out.println(term2);
		byte no=(byte)(term1^term2);
		int count=0;
		while(no!=0)
		{
			no&=no-1;
			count++;
		}
		
		if(count==1)
			return 1;
		else
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte v1=(byte)1;
		byte v2=(byte)2;
		System.out.println(grayCheck(v1,v2));
	}

}
