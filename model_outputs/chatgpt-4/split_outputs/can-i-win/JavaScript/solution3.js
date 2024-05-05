var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

    const winMap = new Map();

    for (let i = 0; i < (1 << maxChoosableInteger); i++) {
        let sum = 0;
        for (let j = 0; j < maxChoosableInteger; j++) {
            if (i & (1 << j)) sum += j + 1;
        }
        if (sum >= desiredTotal) {
            winMap.set(i, true);
        }
    }

    for (let i = (1 << maxChoosableInteger) - 1; i >= 0; i--) {
        if (winMap.has(i)) continue;
        for (let j = 0; j < maxChoosableInteger; j++) {
            if (!(i & (1 << j)) && !winMap.get(i | (1 << j))) {
                winMap.set(i, true);
                break;
            }
        }
        if (!winMap.has(i)) winMap.set(i, false);
    }

    return winMap.get(0);
};
