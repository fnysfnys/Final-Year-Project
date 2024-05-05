var getRow = function(rowIndex) {
    let dp = [[1]];
    for (let i = 1; i <= rowIndex; i++) {
        dp[i] = [];
        for (let j = 0; j <= i; j++) {
            dp[i][j] = (dp[i - 1][j - 1] || 0) + (dp[i - 1][j] || 0);
        }
    }
    return dp[rowIndex];
};
