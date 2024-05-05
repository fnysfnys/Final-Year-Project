var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const maxUniqueDigits = Math.min(n, 10);
    let result = 10;
    
    for (let i = 2; i <= maxUniqueDigits; i++) {
        result += 9 * Math.pow(9, i - 1);
    }
    
    return result;
};
