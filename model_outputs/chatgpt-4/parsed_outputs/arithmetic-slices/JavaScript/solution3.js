var numberOfArithmeticSlices = function(nums) {
    let count = 0, window = 0;
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
            window += 1;
            count += window;
        } else {
            window = 0;
        }
    }
    return count;
};