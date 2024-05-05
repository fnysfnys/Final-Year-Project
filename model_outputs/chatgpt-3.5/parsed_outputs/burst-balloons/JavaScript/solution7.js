var maxCoins = function(nums) {
    const n = nums.length;
    const memo = new Map();

    const dp = (left, right) => {
        if (left + 1 === right) return 0;
        if (memo.has(left + ',' + right)) return memo.get(left + ',' + right);

        let maxCoins = 0;
        for (let k = left + 1; k < right; k++) {
            maxCoins = Math.max(maxCoins, nums[left] * nums[k] * nums[right] + dp(left, k) + dp(k, right));
        }
        memo.set(left + ',' + right, maxCoins);
        return maxCoins;
    };

    return dp(0, n + 1);
};