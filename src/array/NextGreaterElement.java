package array;

import java.io.IOException;
import java.util.Stack;

public class NextGreaterElement {

	Stack<Integer> mystack=new Stack<Integer>();
	public void returnArray(int [] arr)
	{
		mystack.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			int number=mystack.pop();
			if(number>arr[i])
			{
				mystack.push(number);
				mystack.push(arr[i]);
			}
			else if(number<arr[i])
			{
				while(number<arr[i])
				{
					System.out.println(number+"--->"+arr[i]);


					if(!mystack.isEmpty()&& mystack.peek()<arr[i])
						number=mystack.pop();	
					else
						break;
				}
				mystack.push(arr[i]);

			}

		}

		while(!mystack.isEmpty())
		System.out.println(mystack.pop()+"--->"+-1);
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub



		int[] arr={7,5,8,12};
		NextGreaterElement nex=new NextGreaterElement();
		nex.returnArray(arr);



	}

}
