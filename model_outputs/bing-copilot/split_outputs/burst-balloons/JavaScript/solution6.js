var maxCoins = function(nums) {
    const totalSum = nums.reduce((acc, val) => acc + val, 0);
    return totalSum;
};
