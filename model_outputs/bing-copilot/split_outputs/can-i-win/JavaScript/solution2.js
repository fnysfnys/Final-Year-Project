var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const dp = new Array(1 << maxChoosableInteger).fill(false);
    dp[0] = true;
    
    for (let mask = 0; mask < (1 << maxChoosableInteger); mask++) {
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if ((mask & (1 << (i - 1))) === 0) {
                if (!dp[mask | (1 << (i - 1))]) {
                    dp[mask] = true;
                    break;
                }
            }
        }
    }
    
    return dp[0];
};
