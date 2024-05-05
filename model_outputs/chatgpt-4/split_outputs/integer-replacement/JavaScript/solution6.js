var integerReplacement = function(n, count = 0) {
    if (n === 1) return count;
    if (n % 2 === 0) return integerReplacement(n / 2, count + 1);
    return Math.min(integerReplacement(n + 1, count + 1), integerReplacement(n - 1, count + 1));
};
