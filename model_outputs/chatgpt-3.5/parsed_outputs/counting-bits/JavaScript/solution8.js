/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const ans = [0];
    for (let i = 1; i <= n; i++) {
        if (i < 16) {
            ans[i] = ans[i >> 1] + (i & 1);
        } else {
            ans[i] = ans[i >> 4] + ans[i & 0xF];
        }
    }
    return ans;
};