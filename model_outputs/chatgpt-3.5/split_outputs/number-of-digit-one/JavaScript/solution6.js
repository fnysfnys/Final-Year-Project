var countDigitOne = function(n) {
    let count = 0;
    let m = 1;
    
    while (m <= n) {
        let a = Math.floor(n / (m * 10)) * m;
        let b = Math.min(Math.max(n % (m * 10) - m + 1, 0), m);
        count += a + b;
        m *= 10;
    }
    
    return count;
};
