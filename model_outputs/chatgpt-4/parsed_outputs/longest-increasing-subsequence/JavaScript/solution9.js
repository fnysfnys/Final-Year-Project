var lengthOfLIS = function(nums) {
    const dp = Array(nums.length).fill(1);
    let maxLen = 1;

    for (let i = 1; i < nums.length; i++) {
        let changed = false;
        for (let j = 0; j < i; j++) {
            if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
                changed = true;
            }
        }
        if (changed) maxLen = Math.max(maxLen, dp[i]);
    }

    return maxLen;
};