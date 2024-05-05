const longestIncreasingPath = (matrix) => {
  const m = matrix.length, n = matrix[0].length;

  const dfs = (i, j, prev) => {
    if (i < 0 || i >= m || j < 0 || j >= n || matrix[i][j] <= prev) return 0;
    const dirs = [[0, 1], [0, -1], [1, 0], [-1, 0]];
    let maxLen = 0;
    for (const [dx, dy] of dirs) {
      maxLen = Math.max(maxLen, dfs(i + dx, j + dy, matrix[i][j]));
    }
    return maxLen + 1;
  };

  let maxLen = 0;
  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      maxLen = Math.max(maxLen, dfs(i, j, -Infinity));
    }
  }

  return maxLen;
};
