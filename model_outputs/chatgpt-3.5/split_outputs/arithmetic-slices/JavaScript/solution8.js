var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    const sliceCounts = new Map();
    let count = 0;
    
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            count++;
            sliceCounts.set(i, count);
        } else {
            count = 0;
        }
    }
    
    return [...sliceCounts.values()].reduce((total, val) => total + val, 0);
};
