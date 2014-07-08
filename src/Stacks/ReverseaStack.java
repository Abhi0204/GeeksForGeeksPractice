package Stacks;
import java.util.Stack;
public class ReverseaStack {
	
	static Stack<Character> stack2=new Stack<Character>();

	public void reverse(Stack<Character> stack)
	{
	
		if(stack.isEmpty())
			return;
	  char temp=stack.pop();
	  stack2.push(temp);
	  reverse(stack);
	
	}
	
	public void traverseStack(Stack<Character> stack)
	{
		if(!stack.isEmpty())
		{
		System.out.print(stack.peek());
		stack.pop();
		traverseStack(stack);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack1=new Stack<Character>();
		
		stack1.push('A');
		stack1.push('B');
		stack1.push('H');
		stack1.push('I');
		stack1.push('N');
		stack1.push('A');
		stack1.push('V');


		ReverseaStack  revrse=new ReverseaStack();
		//revrse.traverseStack(stack1);
	
		revrse.reverse(stack1);
		revrse.traverseStack(stack2);
		
	}

}
