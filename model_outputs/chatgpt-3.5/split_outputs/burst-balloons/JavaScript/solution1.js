var maxCoins = function(nums) {
    const n = nums.length;
    const memo = Array.from({ length: n + 2 }, () => Array(n + 2).fill(0));

    const dp = (left, right) => {
        if (left + 1 === right) return 0;
        if (memo[left][right] > 0) return memo[left][right];

        let maxCoins = 0;
        for (let i = left + 1; i < right; i++) {
            maxCoins = Math.max(maxCoins, nums[left] * nums[i] * nums[right] + dp(left, i) + dp(i, right));
        }
        memo[left][right] = maxCoins;
        return maxCoins;
    };

    return dp(0, n + 1);
};
