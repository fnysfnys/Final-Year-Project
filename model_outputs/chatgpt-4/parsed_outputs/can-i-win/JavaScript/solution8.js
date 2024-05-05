var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    let sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
    if (sum < desiredTotal) return false;

    let dp = Array(1 << maxChoosableInteger).fill(false);
    for (let state = 0; state < (1 << maxChoosableInteger); state++) {
        let total = 0;
        for (let i = 0; i < maxChoosableInteger; i++) {
            if (state & (1 << i)) total += i + 1;
        }
        if (total >= desiredTotal) {
            dp[state] = true;
            continue;
        }
        for (let i = 0; i < maxChoosableInteger; i++) {
            if (!(state & (1 << i)) && !dp[state | (1 << i)]) {
                dp[state] = true;
                break;
            }
        }
    }

    return dp[0];
};