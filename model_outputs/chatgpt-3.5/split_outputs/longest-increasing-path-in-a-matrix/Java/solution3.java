public int longestIncreasingPath(int[][] matrix) {
    if (matrix == null || matrix.length == 0) return 0;
    int m = matrix.length, n = matrix[0].length;
    int[][] dp = new int[m][n];
    int max = 1;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            max = Math.max(max, dfs(matrix, i, j, dp));
        }
    }
    return max;
}

private int dfs(int[][] matrix, int i, int j, int[][] dp) {
    if (dp[i][j] != 0) return dp[i][j];
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int max = 1;
    for (int[] dir : directions) {
        int x = i + dir[0];
        int y = j + dir[1];
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] > matrix[i][j]) {
            max = Math.max(max, 1 + dfs(matrix, x, y, dp));
        }
    }
    dp[i][j] = max;
    return max;
}
