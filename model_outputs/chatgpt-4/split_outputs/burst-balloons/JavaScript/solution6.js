var maxCoins = function(nums) {
    let memo = {};
    function calculateMaxCoins(left, right) {
        if (left > right) return 0;
        let key = left + "," + right;
        if (key in memo) return memo[key];

        let maxCoins = 0;
        for (let i = left; i <= right; i++) {
            let coins = (nums[left - 1] || 1) * nums[i] * (nums[right + 1

] || 1);
            maxCoins = Math.max(
                maxCoins,
                coins + calculateMaxCoins(left, i - 1) + calculateMaxCoins(i + 1, right)
            );
        }
        memo[key] = maxCoins;
        return maxCoins;
    }
    nums = [1, ...nums, 1];
    return calculateMaxCoins(1, nums.length - 2);
};
