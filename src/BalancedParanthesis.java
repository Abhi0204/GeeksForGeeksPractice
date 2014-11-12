
public class BalancedParanthesis {


	public static void printParanthesis(int total,int open,int close,String str)
	{
		if(close==total)
			{
			System.out.println(str);
		return;
			}
		if(open<total)
			printParanthesis(total, open+1, close, str+"{");
		if(close<open)
			printParanthesis(total, open, close+1, str+"}");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParanthesis(2, 0, 0, " ");
	}

}
