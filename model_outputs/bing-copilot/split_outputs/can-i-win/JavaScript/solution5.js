var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    return desiredTotal % (maxChoosableInteger + 1) !== 0;
};
