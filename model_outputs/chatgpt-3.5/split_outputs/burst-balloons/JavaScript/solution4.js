var maxCoins = function(nums) {
    const n = nums.length;
    const memo = new Map();

    const dp = (left, right) => {
        if (left + 1 === right) return 0;
        if (memo.has(left * n + right)) return memo.get(left * n + right);

        let maxCoins = 0;
        for (let i = left + 1; i < right; i++) {
            maxCoins = Math.max(maxCoins, nums[left] * nums[i] * nums[right] + dp(left, i) + dp(i, right));
        }
        memo.set(left * n + right, maxCoins);
        return maxCoins;
    };

    return dp(0, n + 1);
};
