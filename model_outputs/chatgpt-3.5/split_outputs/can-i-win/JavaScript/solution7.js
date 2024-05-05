var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const dp = new Array(desiredTotal + 1).fill(false).map(() => new Array(1 << maxChoosableInteger).fill(false));
    
    for (let i = 1; i <= maxChoosableInteger; i++) {
        if (i >= desiredTotal) return true;
        dp[i] = dp[i] || [];
        dp[i][1 << (i - 1)] = true;
    }
    
    for (let total = maxChoosableInteger + 1; total <= desiredTotal; total++) {
        for (let mask = 1; mask < (1 << maxChoosableInteger); mask++) {
            for (let i = 1; i <= maxChoosableInteger; i++) {
                if ((mask & (1 << (i - 1))) !== 0) {
                    if (!dp[total - i][mask ^ (1 << (i - 1))]) {
                        dp[total][mask] = true;


                        break;
                    }
                }
            }
        }
    }
    
    return dp[desiredTotal][(1 << maxChoosableInteger) - 1];
};
