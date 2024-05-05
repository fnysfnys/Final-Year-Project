var numberOfArithmeticSlices = function(nums, index = 2, count = 0) {
    if (index >= nums.length) return count;
    if (nums[index] - nums[index - 1] == nums[index - 1] - nums[index - 2]) {
        return numberOfArithmeticSlices(nums, index + 1, count + index - 1);
    }
    return numberOfArithmeticSlices(nums, index + 1, count);
};