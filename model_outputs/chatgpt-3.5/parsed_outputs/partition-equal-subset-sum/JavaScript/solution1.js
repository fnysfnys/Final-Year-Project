var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;
    const memo = new Array(nums.length).fill(null).map(() => new Array(targetSum + 1).fill(undefined));

    function canPartitionHelper(index, target) {
        if (target === 0) return true;
        if (index < 0 || target < 0) return false;
        if (memo[index][target] !== undefined) return memo[index][target];

        memo[index][target] = canPartitionHelper(index - 1, target) || canPartitionHelper(index - 1, target - nums[index]);
        return memo[index][target];
    }

    return canPartitionHelper(nums.length - 1, targetSum);
};