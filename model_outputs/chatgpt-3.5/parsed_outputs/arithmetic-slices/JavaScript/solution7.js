var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    const sequences = new Set();
    
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            sequences.add(`${i - 2}-${i}`);
        }
    }
    
    return sequences.size;
};