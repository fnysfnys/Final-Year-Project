var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const used = new Array(maxChoosableInteger + 1).fill(false);
    
    function canWin(mask, total) {
        if (total >= desiredTotal) return false;
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(mask | (1 << i), total + i)) {
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }
        
        return false;
    }
    
    return canWin(0, 0);
};
