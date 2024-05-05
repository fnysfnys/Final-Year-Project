/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let uglyNumbers = new Set([1]);
    let arr = [1];

    while (arr.length < n) {
        let min = Math.min(arr[0] * 2, arr[0] * 3, arr[0] * 5);
        uglyNumbers.add(min);
        arr.push(min);
        arr = Array.from(uglyNumbers).sort((a, b) => a - b);
        arr = arr.slice(arr.indexOf(min));
    }

    return arr[0];
};