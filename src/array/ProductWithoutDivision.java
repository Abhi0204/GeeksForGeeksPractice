package array;

public class ProductWithoutDivision {

	public void getProduct(int[] arr) {
		int[] leftArray = new int[arr.length];
		int[] rightArray = new int[arr.length];

		leftArray[0] = 1;
		int product = 1;
		product = product * arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftArray[i] = product;
			product = product * arr[i];

		}
		product = 1;
		product = product * arr[arr.length - 1];
		rightArray[arr.length - 1] = 1;
		for (int j = arr.length - 2; j >= 0; j--) {

			rightArray[j] = product;
			product = product * arr[j];
		}

		for (int i = 0; i < arr.length; i++) 
			System.out.println(leftArray[i] * rightArray[i]);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mainArray = { 2, 4, 5, 1, 7 };

		ProductWithoutDivision prod = new ProductWithoutDivision();
		prod.getProduct(mainArray);

	}

}
