package array;

import java.util.HashSet;

public class EliminateVowel 
{
 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static String eliminateVowelString(String string){
    // Eliminate all the vowels from the input string
    // Return the string without vowels
    // INSERT YOUR CODE HERE
    HashSet<Character> mySet=new HashSet<Character>();
    mySet.add('a');
    mySet.add('e');
    mySet.add('i');
    mySet.add('o');
    mySet.add('u');
    mySet.add('A');
    mySet.add('E');
     mySet.add('I'); 
     mySet.add('O');
      mySet.add('U');
      
      char[] arr=string.toCharArray();
      for(int i=0;i<arr.length;i++)
      {
          if(mySet.contains(string.charAt(i)))
        	  arr[i]=arr[i+1];
      }

      return arr.toString();

  } 
// METHOD SIGNATURE ENDS

// DO NOT IMPLEMENT THE main( ) METHOD
  public static void main(String[] args) 
  {
    // PLEASE DO NOT MODIFY THIS FUNCTION
    // YOUR FUNCTION SHALL BE AUTOMATICALLY CALLED AND THE INPUTS FROM HERE SHALL BE PASSED TO IT
    String string="AbhinDVFFFv";
    String result; 
    // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
    result=eliminateVowelString(string);
    System.out.println(result);
    // Print the output
  }
}
