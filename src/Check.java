import java.util.Arrays;


public class Check {


	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        Arrays.sort(A);
	        int firstIndex=-1;
	        int secondIndex=-1;
	        int max_Found=Integer.MIN_VALUE;
	        
	        for(int i=0;i<A.length-1;i++)
	        {
	            if(A[i+1]-A[i]>max_Found)
	            {
	                max_Found=A[i+1]-A[i];
	                firstIndex=i;
	                secondIndex=i+1;
	            }
	        }
	             
	        int mean=(A[firstIndex]+A[secondIndex])/2;
	        int largest_gap=Math.min(Math.abs(mean-A[firstIndex]),Math.abs(mean-A[secondIndex]));
	       
	        return largest_gap;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr={10,0,8,2,-1,12,11,3};
   Check ch=new Check();
   System.out.println(ch.solution(arr));
	}

}
