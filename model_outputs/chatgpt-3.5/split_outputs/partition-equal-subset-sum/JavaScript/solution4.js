var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;

    function backtrack(index, currentSum) {
        if (currentSum === targetSum) return true;
        if (index >= nums.length || currentSum > targetSum) return false;

        return backtrack(index + 1, currentSum) || backtrack(index + 1, currentSum + nums[index]);
    }

    return backtrack(0, 0);
};
