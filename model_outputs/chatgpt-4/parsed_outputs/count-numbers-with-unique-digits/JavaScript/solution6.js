/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    let count = 10, availableDigits = 9;

    for (let i = 2; i <= n; i++) {
        availableDigits -= 1;
        count += 9 * factorial(availableDigits, i - 1);
    }

    return count;
};

function factorial(n, times) {
    let result = 1;
    while (times--) result *= n--;
    return result;
};