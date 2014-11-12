package DynamicProgramming;

public class FibonnaciSeries {

	int[] lookup=new int[1000];
	public int findFibbonaciNumber(int n)
	{
		if(n<=1)
			return n;
		return findFibbonaciNumber(n-1)+findFibbonaciNumber(n-2);
	}
	//Memoized Version//Top Down Approach
	public int findFibbonaciNumberMemoized(int n)
	{
		if(lookup[n]==0)
		{
			if(n<=1)
				lookup[n]=n;
			else
				lookup[n]=findFibbonaciNumberMemoized(n-1)+findFibbonaciNumber(n-2);
		}
		
		return lookup[n];
	}
	
	//Bottom Up Approach
	public int findFibbonaciNumberTabulation(int n)
	{
		lookup[0]=0;
		lookup[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			lookup[i]=lookup[i-1]+lookup[i-2];
		}
		
		return lookup[n];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonnaciSeries fib=new FibonnaciSeries();
		System.out.println(fib.findFibbonaciNumberMemoized(10));
	}

}
