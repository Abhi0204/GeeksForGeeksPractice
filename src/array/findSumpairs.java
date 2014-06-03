package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class findSumpairs {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<String> myarray = new ArrayList<String>();
		int count = 0;
		HashSet<Integer> hash = new HashSet<Integer>();

		int sum = Integer.parseInt(inp.readLine());
		String line1 = (inp.readLine());

		String[] elementsArray = line1.split(" ");

		HashSet<Integer> uniqueHash = new HashSet<Integer>();

		for (int i = 0; i < elementsArray.length; i++) {
			int number = Integer.parseInt(elementsArray[i]);
			uniqueHash.add(number);

		}
		for (int i = 0; i < elementsArray.length; i++) {
			int number = Integer.parseInt(elementsArray[i]) - sum;
			if (number < 0) {
				number = -(number);
			}
			if (uniqueHash.contains(number)) 
				myarray.add(elementsArray[i] + "," + number);
			

		}

		for (String str : myarray) {
			String number1 = str.split(",")[0];
			String number2 = str.split(",")[1];

			int result = Integer.parseInt(number1) - Integer.parseInt(number2);
			if (result < 0)
				result = -result;

			if (!hash.contains(result))
				System.out.println(str);

			hash.add(result);

		}

	}
}