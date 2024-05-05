var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const used = new Set();
    
    function canWin(total) {
        if (total <= 0) return false;
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!used.has(i)) {
                used.add(i);
                if (!canWin(total - i)) {
                    used.delete(i);
                    return true;
                }
                used.delete(i);
            }
        }
        
        return false;
    }
    
    return canWin(desiredTotal);
};
