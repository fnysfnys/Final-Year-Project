/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    let end = Math.pow(10, n);
    let count = 0;

    for (let i = 0; i < end; i++) {
        if (isUnique(i)) count++;
    }

    return count;
};

function isUnique(number) {
    let seen = 0;
    while (number > 0) {
        let digit = number % 10;
        if ((seen & (1 << digit)) > 0) return false;
        seen |= (1 << digit);
        number = Math.floor(number / 10);
    }
    return true;
};