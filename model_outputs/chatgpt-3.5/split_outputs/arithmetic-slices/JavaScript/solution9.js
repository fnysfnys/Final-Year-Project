var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    let count = 0;
    let isContinuing = false;
    
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            if (!isContinuing) {
                isContinuing = true;
                count++;
            } else {
                count++;
            }
        } else {
            isContinuing = false;
        }
    }
    
    return count;
};
