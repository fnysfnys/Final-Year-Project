var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    let count = 0;
    let diff = nums[1] - nums[0];
    let windowSize = 2;
    
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === diff) {
            windowSize++;
        } else {
            diff = nums[i] - nums[i - 1];
            windowSize = 2;
        }
        count += Math.max(0, windowSize - 2);
    }
    
    return count;
};
