var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;

    function canPartitionHelper(index, currentSum) {
        if (currentSum === targetSum) return true;
        if (index >= nums.length || currentSum > targetSum) return false;

        return canPartitionHelper(index + 1, currentSum) || canPartitionHelper(index + 1, currentSum + nums[index]);
    }

    return canPartitionHelper(0, 0);
};
