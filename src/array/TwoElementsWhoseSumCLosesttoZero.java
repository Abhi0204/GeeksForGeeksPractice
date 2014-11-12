package array;

import java.util.Arrays;

public class TwoElementsWhoseSumCLosesttoZero {

	public int findClosestSum(int[] arr) {

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;
		int min = Integer.MAX_VALUE;
		while (i < j) {
			int temp = arr[j] + arr[i];
			if (temp > 0)
				j--;
			else
				i++;

			if (Math.abs(temp) < min)
				min = Math.abs(temp);

		}

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,60,-10,70,-80,85};
		TwoElementsWhoseSumCLosesttoZero sum=new TwoElementsWhoseSumCLosesttoZero();
		System.out.println(sum.findClosestSum(arr));
	}

}
