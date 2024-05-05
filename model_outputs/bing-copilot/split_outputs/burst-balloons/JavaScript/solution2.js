var maxCoins = function(nums) {
    const n = nums.length;
    const memo = Array.from({ length: n }, () => Array(n).fill(-1));

    function burst(left, right) {
        if (left > right) return 0;
        if (memo[left][right] !== -1) return memo[left][right];

        let maxCoins = 0;
        for (let k = left; k <= right; k++) {
            const coins =
                nums[left - 1] * nums[k] * nums[right + 1] +
                burst(left, k - 1) +
                burst(k + 1, right);
            maxCoins = Math.max(maxCoins, coins);
        }

        memo[left][right] = maxCoins;
        return maxCoins;
    }

    return burst(1, n - 2);
};
