package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CircularString {

	HashMap<Character, List<String>> mymap = new HashMap<Character, List<String>>();

	public boolean CheckCircularString(String[] arr) {
		for (String str : arr) {
			if (mymap.containsKey(str.charAt(0))) {
				List<String> mystring = mymap.get(str.charAt(0));
				mystring.add(str);
			} else {
				List<String> myString = new ArrayList<String>();
				myString.add(str);
				mymap.put(str.charAt(0), myString);
			}
		}

		String resultString = arr[0];
		mymap.get(resultString.charAt(0)).remove(0);
		if (mymap.get(resultString.charAt(0)).isEmpty())
			mymap.remove(resultString.charAt(0));

		while (!mymap.isEmpty()) {
			int length = resultString.length() - 1;
			if (!mymap.containsKey(resultString.charAt(length)))
				return false;
			else {
				String temp = mymap.get(resultString.charAt(length)).get(0);
				mymap.get(resultString.charAt(length)).remove(0);
				if (mymap.get(resultString.charAt(length)).isEmpty())
					mymap.remove(resultString.charAt(length));
				resultString = resultString + temp;
			}
		}

		if (resultString.charAt(0) == resultString
				.charAt(resultString.length() - 1))
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularString circular = new CircularString();
		String[] arr = { "aaa","bbb","baa","aab"};
		System.out.println(circular.CheckCircularString(arr));
	}

}