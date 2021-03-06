package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) throws IOException {

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		String input = inp.readLine();

		String[] arr = input.split(" ");
		int count = 0;
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		for (String str : arr) {
			if (hash.containsKey(str))
				hash.put(str, hash.get(str) + 1);
			else
				hash.put(str, 1);
		}

		int size = arr.length / 2;
		boolean flag = false;
		for (String str : hash.keySet()) {
			int value = hash.get(str);
			if (value > size) {
				System.out.println(str);
				flag = true;
			}

		}

		if (flag == false)
			System.out.println(0);
	}

}
