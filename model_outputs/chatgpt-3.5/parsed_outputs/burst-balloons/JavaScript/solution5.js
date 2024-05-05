var maxCoins = function(nums) {
    const n = nums.length;
    const memo = Array.from({ length: n + 2 }, () => Array(n + 2).fill(0));

    const dp = (left, right) => {
        if (left + 1 === right) return 0;
        if (memo[left][right] > 0) return memo[left][right];

        let maxCoins = 0;
        for (let k = left + 1; k < right; k++) {
            maxCoins = Math.max(maxCoins, nums[left] * nums[k] * nums[right] + dp(left, k) + dp(k, right));
        }
        memo[left][right] = maxCoins;
        return maxCoins;
    };

    return dp(0, n + 1);
};