/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let uglyNumbers = [1];
    let i2 = 0, i3 = 0, i5 = 0;

    while (uglyNumbers.length < n) {
        let next2 = uglyNumbers[i2] * 2;
        let next3 = uglyNumbers[i3] * 3;
        let next5 = uglyNumbers[i5] * 5;
        let nextUgly = Math.min(next2, next3, next5);
        if (nextUgly === next2) i2++;
        if (nextUgly === next3) i3++;
        if (nextUgly === next5) i5++;
        uglyNumbers.push(nextUgly);
    }

    return uglyNumbers[n - 1];
};