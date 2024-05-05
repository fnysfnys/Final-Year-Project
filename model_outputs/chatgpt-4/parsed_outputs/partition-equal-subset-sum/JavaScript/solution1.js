var canPartition = function(nums) {
    let totalSum = nums.reduce((acc, curr) => acc + curr, 0);
    if (totalSum % 2 !== 0) return false;
    let target = totalSum / 2;

    function canFindSubset(index, sum) {
        if (sum === target) return true;
        if (sum > target || index < 0) return false;
        return canFindSubset(index - 1, sum + nums[index]) || canFindSubset(index - 1, sum);
    }

    return canFindSubset(nums.length - 1, 0);
};