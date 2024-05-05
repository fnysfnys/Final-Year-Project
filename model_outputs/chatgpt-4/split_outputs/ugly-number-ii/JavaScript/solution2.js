/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n, memo = {1: 1}) {
    if (memo[n] !== undefined) return memo[n];

    let count = 1, num = 1;
    while (count < n) {
        num++;
        if (isUgly(num)) {
            memo[++count] = num;
        }
    }

    return memo[n];

    function isUgly(num) {
        for (let p of [2, 3, 5]) {
            while (num % p === 0) num /= p;
        }
        return num === 1;
    }
};
