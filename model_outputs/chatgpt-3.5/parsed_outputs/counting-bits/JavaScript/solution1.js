/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const ans = [];
    for (let i = 0; i <= n; i++) {
        ans.push(Number(i).toString(2).split('1').length - 1);
    }
    return ans;
};