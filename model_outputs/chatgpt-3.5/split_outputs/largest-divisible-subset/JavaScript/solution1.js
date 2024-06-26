var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    const dp = new Array(n).fill(1);
    let maxIndex = 0;

    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i] % nums[j] === 0) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        if (dp[i] > dp[maxIndex]) {
            maxIndex = i;
        }
    }

    const result = [];
    let currentDivisor = nums[maxIndex];
    let currentLength = dp[maxIndex];

    for (let i = maxIndex; i >= 0; i--) {
        if (currentDivisor % nums[i] === 0 && dp[i] === currentLength) {
            result.unshift(nums[i]);
            currentDivisor = nums[i];
            currentLength--;
        }
    }

    return result;
};
