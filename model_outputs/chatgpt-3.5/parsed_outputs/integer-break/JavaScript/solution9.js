var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    let product = 1;
    
    switch (n % 3) {
        case 0:
            while (n > 0) {
                product *= 3;
                n -= 3;
            }
            break;
        case 1:
            while (n > 4) {
                product *= 3;
                n -= 3;
            }
            product *= 4;
            break;
        case 2:
            while (n > 2) {
                product *= 3;
                n -= 3;
            }
            break;
    }
    
    return product;
};