var numberOfArithmeticSlices = function(nums) {
    let prev = 0;
    let count = 0;
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            prev = prev + 1;
            count += prev;
        } else {
            prev = 0;
        }
    }
    return count;
};
