var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const dp = new Array(desiredTotal + 1).fill(false);
    
    for (let i = 1; i <= maxChoosableInteger; i++) {
        if (i >= desiredTotal) return true;
        dp[i] = true;
    }
    
    for (let total = maxChoosableInteger + 1; total <= desiredTotal; total++) {
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (total - i <= 0) break;
            if (!dp[total - i]) {
                dp[total] = true;
                break;
            }
        }
    }
    
    return dp[desiredTotal];
};