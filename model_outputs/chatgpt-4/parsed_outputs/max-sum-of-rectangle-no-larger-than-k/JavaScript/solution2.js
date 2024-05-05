var maxSumSubmatrix = function(matrix, k) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let rows = matrix.length, cols = matrix[0].length;
    let dp = Array.from({ length: rows + 1 }, () => new Array(cols + 1).fill(0));

    for (let i = 1; i <= rows; i++) {
        for (let j = 1; j <= cols; j++) {
            dp[i][j] = matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            for (let x = 0; x < i; x++) {
                for (let y = 0; y < j; y++) {
                    let sum = dp[i][j] - dp[x][j] - dp[i][y] + dp[x][y];
                    if (sum <= k) maxSum = Math.max(maxSum, sum);
                }
            }
        }
    }

    return maxSum;
};