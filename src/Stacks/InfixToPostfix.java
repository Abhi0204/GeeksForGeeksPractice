package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

	Stack<Character> mystack;
	HashMap<Character, Integer> myhash = new HashMap<Character, Integer>();
	String postfix = "";
	boolean flag = false;

	public InfixToPostfix() {
		myhash.put('*', 10);
		myhash.put('/', 10);
		myhash.put('+', 9);
		myhash.put('-', 9);
		mystack = new Stack<Character>();
	}

	public void ConvertToPostfix(String infix) {
		for (int i = 0; i < infix.length(); i++) {

			if(myhash.containsKey(infix.charAt(i)))
			{
				if(!mystack.empty())
				{
					while(!mystack.empty())
					{
						if(myhash.get(infix.charAt(i))>myhash.get(mystack.peek()))
						{
							mystack.push(infix.charAt(i));
							break;
						}
						else
							postfix=postfix+mystack.pop();
					}
				}
				else
					mystack.push(infix.charAt(i));
				
			}
			else
				postfix=postfix+infix.charAt(i);
		}
		
		for(int i=0;i<mystack.size();i++)
			postfix=postfix+mystack.peek();
		System.out.println(postfix);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infix = "2+3*4+5*6";
		InfixToPostfix in = new InfixToPostfix();
		in.ConvertToPostfix(infix);
	}

}
