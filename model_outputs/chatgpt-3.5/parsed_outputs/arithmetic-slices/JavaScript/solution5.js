var numberOfArithmeticSlices = function(nums) {
    if (nums.length < 3) return 0;
    
    let count = 0;
    
    for (let i = 0; i < nums.length - 2; i++) {
        for (let j = i + 2; j < nums.length; j++) {
            if (nums[j] - nums[j - 1] === nums[j - 1] - nums[j - 2]) {
                count++;
            } else {
                break;
            }
        }
    }
    
    return count;
};