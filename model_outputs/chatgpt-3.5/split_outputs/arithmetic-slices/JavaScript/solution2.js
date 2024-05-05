var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    const dp = Array(nums.length).fill(0);
    let count = 0;
    
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            count++;
            dp[i] = count + dp[i - 1];
        }
    }
    
    return dp.reduce((total, val) => total + val, 0);
};
