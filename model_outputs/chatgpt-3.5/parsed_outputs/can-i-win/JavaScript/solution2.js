var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const dp = new Array(1 << maxChoosableInteger).fill(false);
    
    for (let mask = 0; mask < (1 << maxChoosableInteger); mask++) {
        for (let i = 1; i <= maxChoosableInteger; i++) {
            const bit = 1 << (i - 1);
            if ((mask & bit) === 0) {
                if (!dp[mask | bit]) {
                    dp[mask] = true;
                    break;
                }
            }
        }
    }
    
    return dp[0];
};