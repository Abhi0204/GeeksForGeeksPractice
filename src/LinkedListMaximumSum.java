import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LinkedListMaximumSum {

	static String[] linkedList1;
	static String[] linkedList2;
	static int sum1 = 0;
	static int sum2 = 0;

	public static int calSum(String str) {
		int sum = 0;
		System.out.println(str);
		String[] total = str.split("\\-");
		int index = Integer.parseInt(total[0]);

		if (sum2 > sum1) {
			for (int i = index; i <= Integer.parseInt(total[1]); i++) {
				sum = sum + Integer.parseInt(linkedList1[i]);
			}
			int index1 = Integer.parseInt(total[2]);

			for (int i = index1 + 1; i <= Integer.parseInt(total[3]); i++) {
				sum = sum + Integer.parseInt(linkedList2[i]);
			}
			return sum;
		}

		else {
			for (int i = index; i <= Integer.parseInt(total[1]); i++) {
				sum = sum + Integer.parseInt(linkedList2[i]);
			}
			int index1 = Integer.parseInt(total[2]);

			for (int i = index1 + 1; i <= Integer.parseInt(total[3]); i++) {
				sum = sum + Integer.parseInt(linkedList1[i]);
			}
			return sum;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String line1 = br.readLine();

		linkedList1 = line.split(" ");
		linkedList2 = line1.split(" ");

		ArrayList<Integer> arr = new ArrayList<Integer>();

		HashMap<Integer, Integer> linkedList1Map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> linkedList2Map = new HashMap<Integer, Integer>();

		for (String str : linkedList1) {
			sum1 = sum1 + Integer.parseInt(str);
		}

		for (String str : linkedList2) {
			sum2 = sum2 + Integer.parseInt(str);
		}

		for (int i = 0; i < linkedList1.length; i++) {
			if (!linkedList1Map.containsKey(Integer.parseInt(linkedList1[i])))
				linkedList1Map.put(Integer.parseInt(linkedList1[i].trim()), i);

		}

		for (int i = 0; i < linkedList2.length; i++) {
			if (!linkedList2Map.containsKey(Integer.parseInt(linkedList2[i])))

				linkedList2Map.put(Integer.parseInt(linkedList2[i]), i);

		}

		ArrayList<Integer> newList = new ArrayList<Integer>();
		int i = 0;
		String range = "";
		if (sum2 > sum1) {
			while (i < linkedList1.length) {
				int key = Integer.parseInt(linkedList1[i]);
				if (linkedList2Map.containsKey(key)) {
					range = 0 + "-" + i + "-"
							+ (linkedList2Map.get(key)).toString() + "-"
							+ (linkedList2.length - 1);
					int finalsum = 0;
					int sum = calSum(range);
					if (sum > finalsum) {
						range = 0 + "-" + i + "-"
								+ (linkedList2Map.get(key)).toString() + "-"
								+ (linkedList2.length - 1);
						finalsum = sum;
					}
				}

				i++;
			}

		} else {
			while (i < linkedList2.length) {
				int key = Integer.parseInt(linkedList2[i]);
				if (linkedList1Map.containsKey(key)) {
					range = 0 + "-" + i + "-"
							+ (linkedList1Map.get(key)).toString() + "-"
							+ (linkedList1.length - 1);
					int finalsum = 0;
					int sum = calSum(range);
					if (sum > finalsum) {
						range = 0 + "-" + i + "-"
								+ (linkedList1Map.get(key)).toString() + "-"
								+ (linkedList1.length - 1);
						finalsum = sum;
					}
				}

				i++;
			}
		}

		String[] index = range.split("\\-");
		String finalLinkedList = "";
		if (sum2 > sum1) {
			for (int j = Integer.parseInt(index[0]); j <= Integer
					.parseInt(index[1]); j++) {

				finalLinkedList = finalLinkedList + " " + linkedList1[j] + " ";

			}

			for (int j = Integer.parseInt(index[2]) + 1; j <= Integer
					.parseInt(index[3]); j++) {

				finalLinkedList = finalLinkedList + " " + linkedList2[j] + " ";

			}
		} else {
			for (int j = Integer.parseInt(index[0]); j <= Integer
					.parseInt(index[1]); j++) {

				finalLinkedList = finalLinkedList + " " + linkedList2[j] + " ";

			}

			for (int j = Integer.parseInt(index[2]) + 1; j <= Integer
					.parseInt(index[3]); j++) {

				finalLinkedList = finalLinkedList + " " + linkedList1[j] + " ";

			}
		}

		System.out.println(finalLinkedList.trim());
	}

}
