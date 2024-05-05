/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let uglies = [1];

    for (let i = 1; i < n; i++) {
        let last = uglies[i - 1];
        let nextUglies = [last * 2, last * 3, last * 5].filter(x => !uglies.includes(x));
        uglies.push(Math.min(...nextUglies));
        uglies.sort((a, b) => a - b);
    }

    return uglies[n - 1];
};
