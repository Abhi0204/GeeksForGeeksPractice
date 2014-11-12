package Stacks;

import java.util.Stack;
public class EvaluatePostFix {

	
	public void evaluate(String str)
	{
		Stack<Integer> myStack=new Stack<Integer>();
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)!='*')&&(str.charAt(i)!='+')&&(str.charAt(i)!='-')&&(str.charAt(i)!='/'))
					{
				 myStack.push(str.charAt(i)-'0');
					}
			else
			{
				if(myStack.isEmpty()==false)
				{
					int first=myStack.pop();
					int second=myStack.pop();
					
					int result=eval(str.charAt(i),second,first);
					myStack.push(result);
				}
			}
		}
		
		System.out.println(myStack.pop());
	}
	
	public int eval(char key,int first,int second)
	{
		char keygen=key;
		switch(keygen)
		{
		case '*' : return first*second;
		case '+' : return first+second;
		case '/' : return first/second;
		case '-' : return first-second;
		default:    return 0;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvaluatePostFix eval=new EvaluatePostFix();
		eval.evaluate("231*+9-");
	}

}
