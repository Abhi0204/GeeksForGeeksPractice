package array;

import java.util.Arrays;


public class FindTheNextGreaterElement {

	
	public String findNextGreater(String number)
	{
		
		char[] arr=number.toCharArray();
		int index=0;
		for(int i=arr.length-1;i>0;i--)
	
		{
			if(arr[i]>arr[i-1])
			{
				index=i-1;
				break;
			}
		}
		
		char min=(char)Integer.MAX_VALUE;
           int nextIndex=-1;
		for(int j=index;j<arr.length;j++)
		
			{
			if((arr[j]>arr[index])&&((arr[j]<min)))
			{
			min=arr[j];
			nextIndex=j; 
			}
			}
		
		if(nextIndex==-1)
			return number;
		//swap
	char temp=arr[nextIndex];
	arr[nextIndex]=arr[index];
	arr[index]=temp;
		String result="";
		char[] newArray=new char[arr.length-index-1];
		int p=0;
		for(int i=index+1;i<arr.length;i++)
		{
			newArray[p]=arr[i];
			p++;
		}
		

	for(int i=0;i<=index;i++)
		result=result+arr[i];
	
	for(int i=newArray.length-1;i>=0;i--)
		result=result+newArray[i];
	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTheNextGreaterElement find=new FindTheNextGreaterElement();
		System.out.println(find.findNextGreater("12345"));
	}

}
