var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const used = new Array(maxChoosableInteger + 1).fill(false);
    
    function canWin(total) {
        if (total <= 0) return false;
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(total - i)) {
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }
        
        return false;
    }
    
    return canWin(desiredTotal);
};
