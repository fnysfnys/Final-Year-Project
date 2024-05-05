var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;

    function canPartitionHelper(index, currentSum) {
        if (currentSum === targetSum) return true;
        if (index >= nums.length) return false;

        return canPartitionHelper(index + 1, currentSum + nums[index]) || canPartitionHelper(index + 1, currentSum);
    }

    return canPartitionHelper(0, 0);
};