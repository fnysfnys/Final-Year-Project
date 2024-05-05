var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const memo = new Map();

    function canWin(used, currentTotal) {
        if (currentTotal >= desiredTotal) return false;
        if (memo.has(used)) return memo.get(used);

        for (let i = 1; i <= maxChoosableInteger; i++) {
            let mask = 1 << i;
            if (!(used & mask)) {
                if (!canWin(used | mask, currentTotal + i)) {
                    memo.set(used, true);
                    return true;
                }
            }
        }

        memo.set(used, false);
        return false;
    }

    return canWin(0, 0);
};
