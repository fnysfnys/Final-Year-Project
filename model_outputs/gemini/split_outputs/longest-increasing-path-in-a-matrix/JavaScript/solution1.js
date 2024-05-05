const longestIncreasingPath = (matrix) => {
  const m = matrix.length, n = matrix[0].length;
  const dp = new Array(m).fill(null).map(() => new Array(n).fill(0));

  const dfs = (i, j) => {
    if (dp[i][j] !== 0) return dp[i][j];
    const dirs = [[0, 1], [0, -1], [1, 0], [-1, 0]];
    let maxLen = 0;
    for (const [dx, dy] of dirs) {
      const x = i + dx, y = j + dy;
      if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
        maxLen = Math.max(maxLen, dfs(x, y));
      }
    }
    dp[i][j] = maxLen + 1;
    return dp[i][j];
  };

  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      dfs(i, j);
    }
  }

  return Math.max(...dp.flat());
};
