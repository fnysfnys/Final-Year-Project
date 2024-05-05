var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const memo = {};

    const canWin = (usedNumbers, currentTotal) => {
        if (currentTotal >= desiredTotal) return false;
        if (memo[usedNumbers] !== undefined) return memo[usedNumbers];

        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!(usedNumbers & (1 << i))) {
                if (!canWin(usedNumbers | (1 << i), currentTotal + i)) {
                    memo[usedNumbers] = true;
                    return true;
                }
            }
        }

        memo[usedNumbers] = false;
        return false;
    };

    return canWin(0, 0);
};