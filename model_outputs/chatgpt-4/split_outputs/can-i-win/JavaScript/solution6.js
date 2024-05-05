var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    let sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
    if (sum < desiredTotal) return false;

    let dp = new Array(1 << maxChoosableInteger).fill(false);
    dp[0] = desiredTotal <= 0;

    for (let state = 1; state < (1 << maxChoosableInteger); state++) {
        let total = 0;
        for (let i = 0; i < maxChoosableInteger; i++) {
            if (state & (1 << i)) {
                total += i + 1;
                if (total >= desiredTotal) {
                    dp[state] = true;
                    break;
                }
                if (!dp[state ^ (1 << i)]) {
                    dp[state] = true;
                    break;
                }
            }
        }
    }

    return dp[(1 << maxChoosableInteger) - 1];
};
