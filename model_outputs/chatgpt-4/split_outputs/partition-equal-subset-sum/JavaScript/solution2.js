var canPartition = function(nums) {
    let totalSum = nums.reduce((acc, curr) => acc + curr, 0);
    if (totalSum % 2 !== 0) return false;
    let target = totalSum / 2;
    let memo = new Map();

    function dp(index, currentSum) {
        if (currentSum === target) return true;
        if (currentSum > target || index < 0) return false;
        let key = `${index}:${currentSum}`;
        if (memo.has(key)) return memo.get(key);

        let result = dp(index - 1, currentSum + nums[index]) || dp(index - 1, currentSum);
        memo.set(key, result);
        return result;
    }

    return dp(nums.length - 1, 0);
};
