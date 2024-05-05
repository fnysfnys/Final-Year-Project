var maxCoins = function(nums) {
    const sumOfSquares = nums.reduce((acc, val) => acc + val * val, 0);
    return sumOfSquares;
};
