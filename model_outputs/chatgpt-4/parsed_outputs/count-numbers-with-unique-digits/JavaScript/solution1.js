/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    return 9 * countUniqueDigits(9, n - 1) + countNumbersWithUniqueDigits(n - 1);
};

function countUniqueDigits(start, digitsLeft) {
    if (digitsLeft === 0) return 1;
    return start * countUniqueDigits(start - 1, digitsLeft - 1);
};