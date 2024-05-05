class Solution {
    public int longestIncreasingPath(int[][] matrix) {
      int m = matrix.length, n = matrix[0].length;
      int max = 0;
      int[][] dp = new int[m][n];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          max = Math.max(max, dfs(matrix, i, j, dp));
        }
      }
      return max;
    }
    
    private int dfs(int[][] matrix, int i, int j, int[][] dp) {
      if (dp[i][j] != 0) {
        return dp[i][j];
      }
      int nextLength = 1;
      for (int[] dir : dirs) {
        int newI = i + dir[0];
        int newJ = j + dir[1];
        if (isValid(newI, newJ, matrix.length, matrix[0].length) && matrix[newI][newJ] > matrix[i][j]) {
          nextLength = Math.max(nextLength, dfs(matrix, newI, newJ, dp) + 1);
        }
      }
      dp[i][j] = nextLength;
      return nextLength;
    }
    
}
