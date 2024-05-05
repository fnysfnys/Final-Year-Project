var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    let count = 0;
    const dp = new Array(n).fill(null).map(() => new Array(n).fill(0));
    
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            dp[i][diff] += (dp[j][diff] + 1);
            count += dp[j][diff];
        }
    }
    
    return count;
};