var maxCoins = function(nums) {
    const totalProduct = nums.reduce((acc, val) => acc * val, 1);
    return totalProduct;
};
