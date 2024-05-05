var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    let result = 10;
    let uniqueDigits = 9;
    let availableDigits = 9;
    
    for (let i = 2; i <= n; i++) {
        uniqueDigits *= availableDigits;
        result += uniqueDigits;
        availableDigits--;
    }
    
    return result;
};
