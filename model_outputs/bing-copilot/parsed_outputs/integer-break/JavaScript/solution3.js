/**
 * @param {number} n
 * @param {Map<number, number>} memo
 * @return {number}
 */
var integerBreak = function(n, memo = new Map()) {
    if (n <= 2) return 1;
    if (memo.has(n)) return memo.get(n);
    let maxProduct = 0;
    for (let i = 1; i < n; i++) {
        maxProduct = Math.max(maxProduct, i * Math.max(n - i, integerBreak(n - i, memo)));
    }
    memo.set(n, maxProduct);
    return maxProduct;
};
