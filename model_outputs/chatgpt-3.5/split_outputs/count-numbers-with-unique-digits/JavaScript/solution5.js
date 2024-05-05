var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const maxUniqueDigits = Math.min(n, 10);
    let result = 10;
    let uniqueDigits = 9;
    
    for (let i = 2; i <= maxUniqueDigits; i++) {
        uniqueDigits *= (11 - i);
        result += uniqueDigits;
    }
    
    return result;
};
