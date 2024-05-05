var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    let diff = nums[1] - nums[0];
    let len = 2;
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === diff) {
            len++;
        } else {
            diff = nums[i] - nums[i - 1];
            count += (len - 1) * (len - 2) / 2;
            len = 2;
        }
    }
    count += (len - 1) * (len - 2) / 2;
    return count;
};
