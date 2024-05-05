var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    let i = 0;
    while (i < nums.length - 2) {
        let j = i + 2;
        while (j < nums.length && nums[j] - nums[j - 1] == nums[j - 1] - nums[j - 2]) {
            count++;


            j++;
        }
        i++;
    }
    return count;
};
