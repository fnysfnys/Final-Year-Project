var canIWin = function

(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const memo = new Map();

    function canWin(used, total) {
        if (total >= desiredTotal) return false;
        if (memo.has(used)) return memo.get(used);

        for (let i = maxChoosableInteger; i >= 1; i--) {
            if (!(used & (1 << i))) {
                if (total + i >= desiredTotal || !canWin(used | (1 << i), total + i)) {
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
