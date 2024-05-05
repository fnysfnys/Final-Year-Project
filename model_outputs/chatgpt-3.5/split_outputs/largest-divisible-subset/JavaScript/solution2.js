var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    const dp = new Array(n).fill(1);
    const sets = new Array(n).fill(null).map(() => new Set());

    for (let i = 1; i < n; i++) {
        for (let j = 0; j < i; j++) {
            if (nums[i] % nums[j] === 0 && dp[i] < dp[j] + 1) {
                dp[i] = dp[j] + 1;
                sets[i] = new Set([...sets[j], nums[i]]);
            }
        }
    }

    let maxIndex = 0;
    for (let i = 0; i < n; i++) {
        if (dp[i] > dp[maxIndex]) {
            maxIndex = i;
        }
    }

    return Array.from(sets[maxIndex]);
};
