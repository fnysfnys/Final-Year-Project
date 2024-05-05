var countNumbersWithUniqueDigits = function(n) {
    const results = [1, 10];
    
    for (let i = 2; i <= n; i++) {
        let uniqueDigits = 9;
        for (let j = 0; j < i - 1; j++) {
            uniqueDigits *= (9 - j);
        }
        results[i] = results[i - 1] + uniqueDigits;
    }
    
    return results[Math.min(n, 10)];
};