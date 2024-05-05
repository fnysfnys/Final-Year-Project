var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    
    const countUniqueDigits = (n) => {
        if (n === 0) return 1;
        if (n === 1) return 10;
        return countUniqueDigits(n - 1) * (11 - n);
    };
    
    let result = 10;
    
    for (let i = 2; i <= n; i++) {
        result += countUniqueDigits(i - 1);
    }
    
    return result;
};
