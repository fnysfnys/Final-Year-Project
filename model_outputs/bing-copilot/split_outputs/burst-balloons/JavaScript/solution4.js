var maxCoins = function(nums) {
    nums.sort((a, b) => b - a);
    let totalCoins = 0;

    for (let i = 1; i < nums.length; i += 2) {
        totalCoins += nums[i];
    }

    return totalCoins;
};
