package io.test.Week1;

public class IslandPerimeter {
	public static void main(String[] args) {
		int[][] island = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

		int res = islandPerimeter(island);
		System.out.println(res);
	}

	public static int islandPerimeter(int[][] grid) {
		int r = grid.length;
		int c = grid[0].length;

		int perimeter = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) { // if land
					perimeter += 4;
					if (i > 0)
						perimeter -= grid[i - 1][j]; // up
					if (i < r - 1)
						perimeter -= grid[i + 1][j]; // down
					if (j > 0)
						perimeter -= grid[i][j - 1]; // left
					if (j < c - 1)
						perimeter -= grid[i][j + 1]; // right
				}
			}
		}

		return perimeter;
	}

}
