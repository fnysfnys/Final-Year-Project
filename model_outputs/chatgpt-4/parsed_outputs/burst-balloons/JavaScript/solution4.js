var maxCoins = function(nums) {
    let totalCoins = 0;
    while (nums.length > 0) {
        let minIndex = nums.indexOf(Math.min(...nums));
        let coins = (nums[minIndex - 1] || 1) * nums[minIndex] * (nums[minIndex + 1] || 1);
        totalCoins += coins;
        nums.splice(minIndex, 1);
    }
    return totalCoins;
};