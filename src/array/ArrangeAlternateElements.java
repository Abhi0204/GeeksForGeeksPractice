package array;

public class ArrangeAlternateElements {

	/**
	 * @param args
	 */
	public static int[] alternateArrar(int[] arr) {
		int i = 0;
		int index = 0;
		int negIndex = 0;
		int posIndex = 0;
		while (i < arr.length) {
			index = i;
			if (index % 2 == 0 && arr[index] > 0) {
				while (index < arr.length) {
					if (arr[index] < 0) {
						negIndex = index;
						int temp = arr[negIndex];
						for (int j = negIndex; j > i; j--) {
							arr[j] = arr[j - 1];
						}
						arr[i] = temp;
						break;
					}
					index++;
				}

			}

			if (index % 2 != 0 && arr[index] < 0) {
				while (index < arr.length) {
					if (arr[index] > 0) {
						posIndex = index;
						int temp = arr[posIndex];
						for (int j = posIndex; j > i; j--) {
							arr[j] = arr[j - 1];
						}
						arr[i] = temp;
						break;
					}

					index++;
				}

			}

			i++;

		}

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -1, -2, -4, -3, -5, 11, 12, -8 };
		alternateArrar(arr);
		for (int i : arr)
			System.out.print(i + " ");

	}

}
