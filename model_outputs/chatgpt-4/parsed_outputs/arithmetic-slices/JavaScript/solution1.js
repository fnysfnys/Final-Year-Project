var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    for (let i = 0; i < nums.length - 2; i++) {
        for (let j = i + 1; j < nums.length - 1; j++) {
            if (nums[j] - nums[j - 1] == nums[j + 1] - nums[j]) {
                count++;
            } else {
                break;
            }
        }
    }
    return count;
};