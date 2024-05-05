var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    
    function countSlices(start) {
        if (start >= nums.length - 2) return 0;
        if (nums[start + 2] - nums[start + 1] === nums[start + 1] - nums[start]) {
            count++;
            return count + countSlices(start + 1);
        } else {
            return 0;
        }
    }
    
    for (let i = 0; i < nums.length - 2; i++) {
        countSlices(i);
    }
    
    return count;
};