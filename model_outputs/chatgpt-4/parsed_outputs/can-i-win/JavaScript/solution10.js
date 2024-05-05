var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    const sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
    if (sum < desiredTotal) return false;

    const dp = new Array(1 << maxChoosableInteger).fill(false);

    for (let mask = 1; mask < (1 << maxChoosableInteger); mask++) {
        let total = 0;
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (mask & (1 << (i - 1))) {
                total += i;
                if (total >= desiredTotal) {
                    dp[mask] = true;
                    break;
                }
                if (!dp[mask ^ (1 << (i - 1))]) {
                    dp[mask] = true;
                    break;
                }
            }
        }
    }

    return dp[(1 << maxChoosableInteger) - 1];
};