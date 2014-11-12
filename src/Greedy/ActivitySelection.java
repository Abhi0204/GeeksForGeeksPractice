package Greedy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class ActivitySelection {

	public void printActivity(int[] startTime, int[] finishTime) {
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < startTime.length; i++) {
			myMap.put(finishTime[i], startTime[i]);
		}

		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(myMap);
		int finish = treeMap.firstKey();
		int start = treeMap.get(finish);
		System.out.println(start + " " + finish);
		treeMap.remove(finish);
		Iterator<Integer> iter = treeMap.keySet().iterator();
		while (iter.hasNext()) {
			int check = iter.next();
			if (finish < treeMap.get(check)) {
				finish = check;
				System.out.println(treeMap.get(finish) + " " + finish);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] startTime = { 5, 1, 2, 10, 8 };
		int[] finishTime = { 7, 6, 4, 14, 9 };
		ActivitySelection activity = new ActivitySelection();
		activity.printActivity(startTime, finishTime);
	}

}
