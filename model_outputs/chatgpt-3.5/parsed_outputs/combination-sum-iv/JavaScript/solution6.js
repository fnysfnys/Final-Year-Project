/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var combinationSum4 = function(nums, target) {
    if (nums.length === 0) return 0;
    
    const dp = new Array(target + 1).fill(0);
    dp[0] = 1;
    
    for (let i = 1; i <= target; i++) {
        for (const num of nums) {
            if (i >= num) {
                dp[i] += dp[i - num];
            }
        }
    }
    
    return dp[target];
};