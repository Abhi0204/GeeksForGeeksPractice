package Stacks;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

	Stack<Character> mystack;
	HashMap<Character, Integer> myhash = new HashMap<Character, Integer>();
	String postfix = "";
	boolean flag = false;

	public InfixToPostfix() {
		myhash.put('^', 11);
		myhash.put('*', 10);
		myhash.put('/', 10);
		myhash.put('+', 9);
		myhash.put('-', 9);
		myhash.put('(', -1);
		myhash.put(')', -1);

		mystack = new Stack<Character>();
	}

	public void ConvertToPostfix(String infix) {

		for (int i = 0; i < infix.length(); i++) {
			if (!myhash.containsKey(infix.charAt(i)))
				System.out.print(infix.charAt(i));

			else if (infix.charAt(i) == ')') 
			{

				while (!mystack.isEmpty()) {
					char temp = mystack.pop();
					if (temp == '(') {
						break;
					} else
						System.out.print(temp);
				}
			}

			else {
				if (mystack.isEmpty() == true || infix.charAt(i) == '(')
					mystack.push(infix.charAt(i));

				else if (mystack.isEmpty() == false) {

					int comp = myhash.get(infix.charAt(i));
					if (comp > myhash.get(mystack.peek()))
						mystack.push(infix.charAt(i));

					else if (comp <= myhash.get(mystack.peek())) {
						while (!mystack.isEmpty()
								&& comp <= myhash.get(mystack.peek())) {
							System.out.print(mystack.pop());
						}

						mystack.push(infix.charAt(i));

					}

				}

			}
		}

		while (!mystack.isEmpty()) {
			System.out.print(mystack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infix = "a+b*(c^d-e)^(f+g*h)-i";
		InfixToPostfix in = new InfixToPostfix();
		in.ConvertToPostfix(infix);
	}

}
