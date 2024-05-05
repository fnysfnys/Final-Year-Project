var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const canWin = (chosen, total) => {
        for (let i = maxChoosableInteger; i > 0; i--) {
            if (!(chosen & (1 << i)) && total + i >= desiredTotal) {
                return true;
            }
            if (!(chosen & (1 << i)) && !canWin(chosen | (1 << i), total + i)) {
                return true;
            }
        }
        return false;
    };

    return canWin(0, 0);
};
