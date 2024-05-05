var integerBreak = function(n, memo = new Map()) {
    if (n <= 3) return n - 1;
    if (memo.has(n)) return memo.get(n);
    
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
    
    memo.set(n, product);
    return product;
};
