package array;

public class Equilibriumindex {

	
	public int findEquilibriumIndex(int[] arr)
	{
		
		int sumLeft=0;
	    int sum=0;
		for(int i:arr)
			sum=sum+i;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			if(sumLeft==sum)
				return arr[i];
			sumLeft=sumLeft+arr[i];
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={-7,1,5,2,-4,3,0};
		Equilibriumindex equi=new Equilibriumindex();
		System.out.println(equi.findEquilibriumIndex(arr));
	}

}
