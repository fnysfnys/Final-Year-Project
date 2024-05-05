var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const dp = Array(nums.length).fill(0);
    const parent = Array(nums.length).fill(0);
    let maxSize = 0;
    let maxVal = nums[0];

    for (let i = 0; i < nums.length; i++) {
        for (let j = i; j >= 0; j--) {
            if (nums[i] % nums[j] === 0 && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
                parent[i] = j;
                if (dp[i] > maxSize) {
                    maxSize = dp[i];
                    maxVal = nums[i];
                }
            }
        }
    }

    const result = [];
    let k = nums.indexOf(maxVal);
    while (k >= 0 && dp[k] > 0) {
        result.unshift(nums[k]);
        k = parent[k] === k ? -1 : parent[k];
    }
    return result;
};
