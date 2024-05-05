var maxCoins = function(nums) {
    function burst(left, right) {
        if (left > right) return 0;

        let maxCoins = 0;
        for (let k = left; k <= right; k++) {
            const coins =
                nums[left - 1] * nums[k] * nums[right + 1] +
                burst(left, k - 1) +
                burst(k + 1, right);
            maxCoins = Math.max(maxCoins, coins);
        }

        return maxCoins;
    }

    return burst(1, nums.length - 2);
};
