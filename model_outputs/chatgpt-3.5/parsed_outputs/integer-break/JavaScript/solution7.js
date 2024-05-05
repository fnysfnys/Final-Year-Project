var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    let product = 1;
    
    for (let bit = 1; bit <= n - 2; bit++) {
        if ((n - bit) % 3 === 0) {
            product *= Math.pow(3, bit);
            return product * (n - bit);
        }
    }
    
    return Math.pow(3, n / 3);
};