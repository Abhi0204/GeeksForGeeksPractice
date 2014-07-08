package Stacks;
import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {

	Stack<Character> myStack=new Stack<Character>();
	HashMap<Character, Character> mymap=new HashMap<Character, Character>();
	
	
	public BalancedParanthesis()
	{
		mymap.put('(', ')');
		mymap.put('[', ']');
		mymap.put('{', '}');
	}
	public boolean checkBalanced(String str)
	{
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')
	            myStack.push(str.charAt(i));
		   else
		   {
			   if(mymap.get(str.charAt(i))!=myStack.pop())
				   return false;
		   }
	   }
	   return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="[(])";
		BalancedParanthesis balanced=new BalancedParanthesis();
		System.out.println(balanced.checkBalanced(str));
	}

}
