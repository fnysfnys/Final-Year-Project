var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    return Math.pow(3, Math.floor((n - 1) / 3)) * (n % 3 + 1);
};
