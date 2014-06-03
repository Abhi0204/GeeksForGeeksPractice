package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchRotatedArray {

	public static int findPivot(int[] arr, int low, int high) {

		int middle = 0;

		while (low <= high) {
			middle = (low + high) / 2;
			if (arr[middle] < arr[middle - 1]) 
				return middle - 1;
			else if (arr[middle] > arr[middle + 1])
				return middle;
			else if (arr[low] > arr[middle]) 
				high = middle - 1;
			 else if (arr[low] < arr[middle])
				low = middle + 1;
		}
		return -1;
	}

	public static void FindRightArray(int[] arr, int pivot, int number) {

		int low = pivot + 1;
		int high = arr.length - 1;
		int middle = 0;
		boolean flag = false;
		while (low <= high) {
			middle = (low + high) / 2;
			if (number == arr[middle]) {
				flag = true;
				break;
			} else if (number < arr[middle])
				high = middle - 1;
			else
				low = middle + 1;

		}
		if (flag == true)

			System.out.println("Number found at location " + middle
					+ " in the right array");

		else

			System.out.println("Number Not Found in the right array");

	}

	public static void FindLeftArray(int[] arr, int pivot, int number) {

		int low = 0;
		int high = pivot;
		int middle = 0;
		boolean flag = false;
		while (low <= high) {

			middle = (low + high) / 2;

			if (number == arr[middle]) {
				flag = true;
				break;
			} else if (number < arr[middle])
				high = middle - 1;
			else
				low = middle + 1;

		}

		if (flag == true)

			System.out.println("Number found at location " + middle
					+ " in the Left array ");

		else
			System.out.println("Number Not Found in left array");

	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		int number = Integer.parseInt(inp.readLine());
		int[] arr = { 4, 6, 8, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, -12,
				-11, -10, -9, -8, -7, -6, -5, -4, 2, 3 };
		int low = 0;
		int high = arr.length - 1;
		int pivot = findPivot(arr, low, high);
		if (number < arr[0])
			FindRightArray(arr, pivot, number);

		else
			FindLeftArray(arr, pivot, number);

	}

}
