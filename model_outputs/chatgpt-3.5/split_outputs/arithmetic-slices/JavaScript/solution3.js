var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    let count = 0;
    let result = 0;
    let i = 2;
    
    while (i < nums.length) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            let j = i;
            while (j < nums.length && nums[j] - nums[j - 1] === nums[j - 1] - nums[j - 2]) {
                j++;
                count++;
            }
            result += (count * (count + 1)) / 2;
            i = j;
        } else {
            i++;
        }
        count = 0;
    }
    
    return result;
};
