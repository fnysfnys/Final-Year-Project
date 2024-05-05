var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const maxUniqueDigits = Math.min(n, 10);
    let result = 10;
    
    for (let i = 2; i <= maxUniqueDigits; i++) {
        result += (9 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1) / (Math.pow(10, i - 1));
    }
    
    return result;
};
