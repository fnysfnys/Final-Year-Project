/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const ans = [0];
    for (let i = 1; i <= n; i++) {
        ans[i] = ans[i & (i - 1)] + 1;
    }
    return ans;
};