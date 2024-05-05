var numDistinct = function(s, t) {
    // Initialize DP table
    let dp = Array(s.length + 1).fill(0).map(() => Array(t.length + 1).fill(0));

    // Base case: if t is an empty string, there's 1 subsequence of s that matches it (empty subsequence)
    for (let i = 0; i <= s.length; i++) {
        dp[i][0] = 1;
    }

    // Fill DP table
    for (let i = 1; i <= s.length; i++) {
        for (let j = 1; j <= t.length; j++) {
            if (s[i - 1] === t[j - 1]) {
                // If characters match, add the number of distinct subsequences by including and excluding the current char
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            } else {
                // If characters don't match, carry forward the value from the previous substring of s
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    // Return the result
    return dp[s.length][t.length];
};