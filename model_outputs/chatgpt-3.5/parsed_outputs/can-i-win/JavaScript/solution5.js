var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (desiredTotal <= 0) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const memo = {};
    
    function canWin(remaining, used) {
        const state = used.join(',');
        if (memo[state] !== undefined) return memo[state];
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!used[i]) {
                used[i] = true;
                if (!canWin(remaining - i, used)) {
                    memo[state] = true;
                    used[i] = false;
                    return true;
                }
                used[i] = false;
            }
        }
        
        memo[state] = false;
        return false;
    }
    
    return canWin(desiredTotal, new Array(maxChoosableInteger + 1).fill(false));
};