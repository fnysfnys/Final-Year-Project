class Solution {
    public int longestIncreasingPath(int[][] matrix) {
      int m = matrix.length, n = matrix[0].length;
      int max = 0;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          max = Math.max(max, dfs(matrix, i, j, 0));
        }
      }
      return max;
    }
    
    private int dfs(int[][] matrix, int i, int j, int length) {
      if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= length) {
        return 0;
      }
      int nextLength = length + 1;
      return Math.max(dfs(matrix, i + 1, j, nextLength), Math.max(dfs(matrix, i - 1, j, nextLength),
          Math.max(dfs(matrix, i, j + 1, nextLength), dfs(matrix, i, j - 1, nextLength))));
    }
    
}
