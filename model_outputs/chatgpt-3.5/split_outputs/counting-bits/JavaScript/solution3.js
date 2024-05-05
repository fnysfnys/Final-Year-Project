/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const ans = [];
    const bitCounts = [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4];
    for (let i = 0; i <= n; i++) {
        let count = 0;
        let num = i;
        while (num > 0) {
            count += bitCounts[num & 0xF];
            num >>= 4;
        }
        ans.push(count);
    }
    return ans;
};
