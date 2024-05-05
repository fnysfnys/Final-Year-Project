var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    let product = 1;
    
    for (let i = 1; i < n; i++) {
        if (n - i <= 4) {
            product *= (n - i);
            break;
        } else {
            product *= 3;
            n -= 3;
        }
    }
    
    return product;
};
