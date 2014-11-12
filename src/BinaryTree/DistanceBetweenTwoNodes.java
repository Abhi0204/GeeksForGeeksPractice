package BinaryTree;

public class DistanceBetweenTwoNodes {

	public int getDistance(Node root,int key,int key2)
	{
	int [] arr=new int[10];
	int [] arr0=new int[10];
	int[] arr1=CreateArrayRootToLeaf(root,key, arr,0);
	int [] arr2=CreateArrayRootToLeaf(root, key2, arr0,0);

	int i=0;
	int j=0;
	int count=0;
      while(i<arr1.length &&j<arr2.length)
      {
    	  if(arr1[i]!=arr2[j])
    		  count+=2;  
    	  i++;
    	  j++;
      }
      if(arr1.length<arr2.length)
    	  count=count+arr2.length-j;
      else
    	  count=count+arr1.length-i;
      
      return count;
      
	
	}
	public int[] CreateArrayRootToLeaf(Node root,int key,int[] arr,int index)
	{
		if(root==null)
			return null;
		arr[index]=root.data;
		if(root.data==key)
			return arr;
		int[] myarr=CreateArrayRootToLeaf(root.leftChild,key,arr,index+1);
		if(myarr==null)
			return CreateArrayRootToLeaf(root.rightChild,key,arr,index+1);
		
		return myarr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(26);
		root.parent=null;
		root.leftChild=new Node(10);
		root.leftChild.parent=root;
		root.leftChild.leftChild=new Node(4);
		root.leftChild.leftChild.parent=root.leftChild;
		root.leftChild.rightChild=new Node(8);
		root.leftChild.rightChild.parent=root.leftChild;
		root.rightChild=new Node(3);
		root.rightChild.parent=root;
		root.rightChild.leftChild=new Node(2);
		root.rightChild.leftChild.parent=root.rightChild;
		root.rightChild.rightChild=new Node(5);
		root.rightChild.rightChild.parent=root.rightChild;
		
		DistanceBetweenTwoNodes distance=new DistanceBetweenTwoNodes();
		System.out.println(distance.getDistance(root,5,4));
	}

}
