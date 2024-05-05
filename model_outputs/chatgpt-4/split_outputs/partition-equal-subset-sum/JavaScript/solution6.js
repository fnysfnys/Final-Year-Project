var canPartition = function(nums) {
    let sum = nums.reduce((acc, val) => acc + val, 0);
    if (sum % 2 != 0) return false;
    let halfSum = sum / 2;

    function search(index, currentSum) {
        if (currentSum == halfSum) return true;
        if (currentSum > halfSum || index == nums.length) return false;
        return search(index + 1, currentSum + nums[index]) || search(index + 1, currentSum);
    }

    return search(0, 0);
};
