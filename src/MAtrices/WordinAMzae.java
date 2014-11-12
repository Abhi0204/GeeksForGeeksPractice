package MAtrices;

import java.util.Scanner;

public class WordinAMzae {

	/**
	 * @param args
	 */

	public boolean findaWord(char[][] maze, String word, int low, int high,
			int index) {

		if (low < 0)
			low = maze.length - 1;
		if (low > maze.length - 1)
			low = 0;
		if (high > maze[0].length - 1)
			high = 0;
		if (high < 0)
			high = maze.length - 1;

		if (maze[low][high] != word.charAt(0))
			return false;

		if (maze[low][high] == word.charAt(0) && word.length() == 1)
			return true;

		// right
		if (findaWord(maze, word.substring(1), low, high + 1, index) ||
		// left
				findaWord(maze, word.substring(1), low, high - 1, index) ||
				// down
				findaWord(maze, word.substring(1), low + 1, high, index) ||
				// up
				findaWord(maze, word.substring(1), low - 1, high, index) == true)
			return true;
		return false;
	}

	public void findaWordinamaze(char[][] maze, String word) {
		boolean flag = false;
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == word.charAt(0)) {
					flag = findaWord(maze, word, i, j, 0);

				}
			}

			if (flag == true) {
				System.out.println("Word Found");
				break;
			}
		}

		if (flag == false)
			System.out.println("Word not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char maze[][] = { { 'a', 'e', 'r', 'o', 'p', 's' },
				{ 'b', 'h', 'a', 'r', 'l', 's' },
				{ 'w', 'r', 'i', 's', 'l', 'o' },
				{ 'a', 's', 'n', 'k', 't', 'q' } };

		Scanner scann = new Scanner(System.in);
		String word = scann.nextLine();
		WordinAMzae wordD = new WordinAMzae();
		wordD.findaWordinamaze(maze, word);

	}

}
