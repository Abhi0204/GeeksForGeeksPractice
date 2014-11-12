package array;

public class SubtracttwoNos {

	public String subtractNos(String str1,String str2)
	{
		int i=str1.length()-1;
		int j=str2.length()-1;
		int index=str1.charAt(str1.length()-1)-'\0';
		int index2=str2.charAt(str2.length()-1)-'\0';
		String res="";
		 j=index;
		int k=index2;
		while(i>=0)
		{
			if(index2>index)
				res=res+(index2=index);
			
			else{
				while(i>=0 && index2<index)
				{
					index=0;
				}
			}
		}
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
