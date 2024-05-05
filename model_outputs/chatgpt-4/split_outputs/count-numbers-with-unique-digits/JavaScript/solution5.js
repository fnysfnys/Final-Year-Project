/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    let count = 1; // for 0
    let used = new Array(10).fill(false);

    const backtrack = (length) => {
        if (length === n) return;
        for (let i = 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                count++;
                backtrack(length + 1);
                used[i] = false;
            }
        }
    };

    backtrack(0);
    return count;
};
