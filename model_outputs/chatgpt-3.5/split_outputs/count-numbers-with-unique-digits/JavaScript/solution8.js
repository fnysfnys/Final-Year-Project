var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const maxUniqueDigits = Math.min(n, 10);
    let result = 10;
    
    for (let i = 2; i <= maxUniqueDigits; i++) {
        let uniqueDigits = 9;
        for (let j = 0; j < i - 1; j++) {
            uniqueDigits *= (9 - j);
        }
        result += uniqueDigits;
    }
    
    return result;
};
