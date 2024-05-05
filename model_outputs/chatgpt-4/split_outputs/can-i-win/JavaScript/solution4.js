var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const canWin = (chosen, total) => {
        if (total >= desiredTotal) return false;

        let key = chosen.toString();
        if (memo[key] !== undefined) return memo[key];

        for (let i = 1; i <= maxChoosableInteger; i++) {
            if

(chosen & (1 << i)) continue;

            if (!canWin(chosen | (1 << i), total + i)) {
                memo[key] = true;
                return true;
            }
        }

        memo[key] = false;
        return false;
    };

    let memo = {};
    return canWin(0, 0);
};
