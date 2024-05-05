var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;
    const dp = new Array(nums.length + 1).fill(false).map(() => new Array(targetSum + 1).fill(false));
    dp[0][0] = true;

    for (let i = 1; i <= nums.length; i++) {
        for (let j = 1; j <= targetSum; j++) {
            if (j >= nums[i - 1]) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    return dp[nums.length][targetSum];
};