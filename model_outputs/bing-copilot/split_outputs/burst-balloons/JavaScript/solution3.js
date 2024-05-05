var maxCoins = function(nums) {
    nums.sort((a, b) => a - b);
    let totalCoins = 0;

    for (let i = nums.length - 2; i >= 0; i -= 2) {
        totalCoins += nums[i];
    }

    return totalCoins;
};
