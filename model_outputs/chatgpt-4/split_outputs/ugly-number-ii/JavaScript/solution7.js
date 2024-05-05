/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    if (n === 1) return 1;

    let count = 1;
    for (let i = 2; count < n; i++) {
        if (isUgly(i)) count++;
        if (count === n) return i;
    }

    function isUgly(num) {
        for (let p of [2, 3, 5]) {
            while (num % p === 0) num /= p;
        }
        return num === 1;
    }
};
