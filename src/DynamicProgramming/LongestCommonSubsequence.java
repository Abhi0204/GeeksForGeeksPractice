package DynamicProgramming;

import java.util.HashSet;

public class LongestCommonSubsequence {

	static HashSet<Character> arr = new HashSet<Character>();

	public int findLCS(String str1, String str2, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
			return 1 + findLCS(str1, str2, m - 1, n - 1);
		}
		return Math.max(findLCS(str1, str2, m - 1, n),
				findLCS(str1, str2, m, n - 1));
	}

	public void findLCSDP(String str1, String str2, int m, int n) {
		int[][] LCS = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					LCS[i][j] = 0;

				else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					LCS[i][j] = LCS[i - 1][j - 1] + 1;
				} else
					LCS[i][j] = Math.max(LCS[i][j - 1], LCS[i - 1][j]);
			}
		}

		int index = LCS[m][n];
		char[] myLCS = new char[index];
		int i = m;
		int j = n;
		while (i > 0 && j > 0) {
			if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
				myLCS[index - 1] = str1.charAt(i - 1);
				i--;
				j--;
				index--;
			}

			else if (LCS[i - 1][j] > LCS[i][j - 1])
				i--;
			else
				j--;
		}

		for (char ch : myLCS)
			System.out.print(ch + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AGTAB";
		String str2 = "GXTXAYB";

		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		lcs.findLCSDP(str, str2, str.length(), str2.length());

	}

}
