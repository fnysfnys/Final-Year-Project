var maxCoins = function(nums) {
    if (nums.length === 1) return nums[0];
    let maxCoins = 0;

    for (let i = 0; i < nums.length; i++) {
        let coins = (nums[i - 1] || 1) * nums[i] * (nums[i + 1] || 1);
        let newNums = [...nums];
        newNums.splice(i, 1);
        maxCoins = Math.max(maxCoins, coins + maxCoins(newNums));
    }
    return maxCoins;
};
