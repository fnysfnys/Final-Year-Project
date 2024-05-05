var numDistinct = function(s, t) {
    const m = s.length;
    const n = t.length;
    
    const dp = Array(n + 1).fill(0);
    dp[0] = 1;
    
    for (let i = 1; i <= m; i++) {
        for (let j = n; j >= 1; j--) {
            dp[j] += s[i - 1] === t[j - 1] ? dp[j - 1] : 0;
        }
    }
    
    return dp[n];
};