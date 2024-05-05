var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    for (let i = 0; i < nums.length - 2; i++) {
        for (let j = i + 2; j < nums.length; j++) {
            if (nums[j] - nums[j - 1] === nums[i + 1] - nums[i]) {
                count++;
            } else {
                break;
            }
        }
    }
    return count;
};
