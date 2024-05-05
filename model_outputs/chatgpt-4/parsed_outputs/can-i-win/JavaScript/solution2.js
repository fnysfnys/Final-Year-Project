var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const dp = new Array(1 << maxChoosableInteger).fill(null);

    const canWin = (state, total) => {
        if (dp[state] !== null) return dp[state];
        for (let i = 0; i < maxChoosableInteger; i++) {
            if (!(state & (1 << i)) && total + i + 1 >= desiredTotal) {
                dp[state] = true;
                return true;
            }
            if (!(state & (1 << i)) && !canWin(state | (1 << i), total + i + 1)) {
                dp[state] = true;
                return true;
            }
        }
        dp[state] = false;
        return false;
    };

    return canWin(0, 0);
};