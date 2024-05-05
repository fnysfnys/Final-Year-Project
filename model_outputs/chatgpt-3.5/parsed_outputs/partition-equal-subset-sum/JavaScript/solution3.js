var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    
    const targetSum = sum / 2;

    function dfs(index, currentSum) {
        if (currentSum === targetSum) return true;
        if (index >= nums.length || currentSum > targetSum) return false;

        return dfs(index + 1, currentSum) || dfs(index + 1, currentSum + nums[index]);
    }

    return dfs(0, 0);
};