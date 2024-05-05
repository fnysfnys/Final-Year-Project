/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    const ans = [];
    const memo = new Array(n + 1).fill(0);
    
    function countOnes(num) {
        if (num === 0) return 0;
        if (memo[num] !== 0) return memo[num];
        memo[num] = (num % 2) + countOnes(num >> 1);
        return memo[num];
    }
    
    for (let i = 0; i <= n; i++) {
        ans.push(countOnes(i));
    }
    return ans;
};
