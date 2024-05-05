var canIWin = function(maxChoosableInteger, desiredTotal) {
    const memo = new Map();
    
    function canWin(mask, total) {
        if (total >= desiredTotal) return false;
        if (memo.has(mask)) return memo.get(mask);
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if ((mask & (1 << i)) === 0) {
                if (!canWin(mask | (1 << i), total + i)) {
                    memo.set(mask, true);
                    return true;
                }
            }
        }
        
        memo.set(mask, false);
        return false;
    }
    
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    return canWin(0, 0);
};
