package DynamicProgramming;

public class UglyNumbers {

	public int findUglyNumber(int n) {
		int[] uglyArray = new int[n];
		int ugly2 = 0, ugly3 = 0, ugly5 = 0;
		uglyArray[0] = 1;

		int nextmultipleof2 = uglyArray[ugly2] * 2;
		int nextmultipleof3 = uglyArray[ugly3] * 3;
		int nextmultipleof5 = uglyArray[ugly5] * 5;

		int nextUglyNumber = 0;
		for (int i = 0; i < uglyArray.length; i++) {
			int min = Math.min(nextmultipleof2, nextmultipleof3);
			nextUglyNumber = Math.min(min, nextmultipleof5);

			if (nextUglyNumber == nextmultipleof2) {
				nextmultipleof2 = 2 * nextmultipleof2;
			} else if (nextUglyNumber == nextmultipleof3) {
				nextmultipleof3 = 3 * nextmultipleof3;
			} else if (nextUglyNumber == nextmultipleof5) {
				nextmultipleof5 = 5 * nextmultipleof5;
			}
			uglyArray[i] = nextUglyNumber;

		}

		return nextUglyNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UglyNumbers ugly=new UglyNumbers();
		System.out.println(ugly.findUglyNumber(6));
	}

}
