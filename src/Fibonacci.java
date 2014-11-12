public class Fibonacci {

	public static void printfibonacci(int n)
	{
		long[] fib=new long[n+1];
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=n;i++)
			fib[i]=fib[i-1]+fib[i-2];
		
		
		System.out.println(fib[n]);
	}
	
	public static int fib(int n)
	{
		if(n<=1)
			return 1;
	
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {

		printfibonacci(10);
	}

}
