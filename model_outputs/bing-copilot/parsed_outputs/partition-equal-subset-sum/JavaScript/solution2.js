var canPartition = function(nums) {
    const sum = nums.reduce((acc, num) => acc + num, 0);
    if (sum % 2 !== 0) return false;
    const target = sum / 2;
    
    const memo = new Map();
    const dp = (index, currentSum) => {
        if (currentSum === target) return true;
        if (index >= nums.length || currentSum > target) return false;
        const key = `${index}-${currentSum}`;
        if (memo.has(key)) return memo.get(key);
        const result = dp(index + 1, currentSum + nums[index]) || dp(index + 1, currentSum);
        memo.set(key, result);
        return result;
    };
    
    return dp(0, 0);
};
