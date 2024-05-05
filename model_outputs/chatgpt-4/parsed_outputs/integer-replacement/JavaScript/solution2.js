var integerReplacement = function(n, memo = {}) {
    if (n === 1) return 0;
    if (memo[n]) return memo[n];
    if (n % 2 === 0) return memo[n] = 1 + integerReplacement(n / 2, memo);
    return memo[n] = 1 + Math.min(integerReplacement(n + 1, memo), integerReplacement(n - 1, memo));
};