var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false; // If total sum is odd, cannot partition equally
    const target = sum / 2;
    
    const dfs = (index, currentSum) => {
        if (currentSum === target) return true;
        if (index >= nums.length || currentSum > target) return false;
        return dfs(index + 1, currentSum + nums[index]) || dfs(index + 1, currentSum);
    };
    
    return dfs(0, 0);
};
