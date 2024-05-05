var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;
    const dp = new Set();
    dp.add(0);

    for (const num of nums) {
        const newSet = new Set(dp);
        for (const val of dp) {
            newSet.add(val + num);
        }
        dp = newSet;
    }

    return dp.has(targetSum);
};