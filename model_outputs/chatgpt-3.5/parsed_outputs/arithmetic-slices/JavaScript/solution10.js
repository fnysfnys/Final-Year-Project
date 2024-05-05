var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    let count = 0;
    let isContinuing = false;
    let i = 2;
    
    while (i < nums.length) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            if (!isContinuing) {
                isContinuing = true;
                count++;
            } else {
                count++;
            }
            i++;
        } else {
            isContinuing = false;
            i++;
        }
    }
    
    return count;
};