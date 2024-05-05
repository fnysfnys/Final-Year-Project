/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    let end = Math.pow(10, n);
    let count = 0;

    for (let i = 0; i < end; i++) {
        if (areDigitsUnique(i)) count++;
    }

    return count;
};

function areDigitsUnique(num) {
    let numStr = num.toString();
    let digitSet = new Set(numStr);
    return digitSet.size === numStr.length;
};