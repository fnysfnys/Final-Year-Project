var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const dp = Array(nums.length).fill(1);
    let maxIndex = 0;

    for (let i = 1; i < nums.length; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i] % nums[j] === 0 && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
                if (dp[i] > dp[maxIndex]) maxIndex = i;
            }
        }
    }

    const result = [];
    let temp = nums[maxIndex];
    let currentDP = dp[maxIndex];
    for (let i = maxIndex; i >= 0; i--) {
        if (temp % nums[i] === 0 && dp[i] === currentDP) {
            result.unshift(nums[i]);
            temp = nums[i];
            currentDP--;
        }
    }
    return result;
};