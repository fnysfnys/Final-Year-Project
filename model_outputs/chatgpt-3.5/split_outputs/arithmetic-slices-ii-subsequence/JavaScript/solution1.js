var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    let count = 0;
    
    for (let i = 0; i < n - 2; i++) {
        for (let j = i + 1; j < n - 1; j++) {
            const diff = nums[j] - nums[i];
            let next = nums[j] + diff;
            let subsequenceLength = 2;
            
            for (let k = j + 1; k < n; k++) {
                if (nums[k] === next) {
                    next += diff;
                    subsequenceLength++;
                }
            }
            
            if (subsequenceLength >= 3) {
                count++;
            }
        }
    }
    
    return count;
};
