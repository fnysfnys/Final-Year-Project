var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    let sliceCount = 0;
    for (let i = 1; i < nums.length - 1; i++) {
        if (nums[i] - nums[i - 1] == nums[i + 1] - nums[i]) {
            sliceCount++;
            count += sliceCount;
        } else {
            sliceCount = 0;
        }
    }
    return count;
};
