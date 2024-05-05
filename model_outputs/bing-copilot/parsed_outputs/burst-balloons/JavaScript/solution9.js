var maxCoins = function(nums) {
    const sumOfCubes = nums.reduce((acc, val) => acc + val * val * val, 0);
    return sumOfCubes;
};
