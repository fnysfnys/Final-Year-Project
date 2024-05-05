public int longestIncreasingPath(int[][] matrix) {
  int m = matrix.length, n = matrix[0].length;
  int max = 0;
  Stack<int[]> stack = new Stack<>();
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      stack.push(new int[]{i, j, 0});
    }
  }
  while (!stack.isEmpty()) {
    int[] cell = stack.pop();
    int i = cell[0], j = cell[1], length = cell[2];
    max = Math.max(max, length);
    for (int[] dir : dirs) {
      int newI = i + dir[0];
      int newJ = j + dir[1];
      if (isValid(newI, newJ, m, n) && matrix[newI][newJ] > matrix[i][j]) {
        stack.push(new int[]{newI, newJ, length + 1});
      }
    }
  }
  return max;
}

int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

private boolean isValid(int i, int j, int m, int n) {
  return i >= 0 && i < m && j >= 0 && j < n;
}
