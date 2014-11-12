package bitOperations;

public class NonRepeatingElelnt {

static void  get2NonRepeatingNos(int arr[], int n, int x, int y)
{
  int xor = arr[0]; /* Will hold xor of all elements */
  int set_bit_no;  /* Will have only single set bit of xor */
  int i;
  x = 0;
  y = 0;
 
  /* Get the xor of all elements */
  for(i = 1; i < n; i++)
   xor ^= arr[i];
 
  /* Get the rightmost set bit in set_bit_no */
  set_bit_no = xor & ~(xor-1);
  for(i = 0; i < n; i++)
  {
	  //System.out.println(arr[i] & set_bit_no);
    if((arr[i] & set_bit_no)!=0)
     x = x ^ arr[i];  
    else
     y = y ^ arr[i];
  }
  
 System.out.println(x);
 System.out.println(y);
}
 
/* Driver program to test above function */
public static void  main(String[] args)
{
  int arr[] = {2,3,2,2,2,11,11,7};
  int x = 0;
  int y =0;
  
 get2NonRepeatingNos(arr, arr.length, x, y);
 
}
	}
