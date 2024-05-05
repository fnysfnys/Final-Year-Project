var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    let count = 0;
    
    for (let i = 0; i < n; i++) {
        const map = new Map();
        
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            const prevCount = map.get(diff) || 0;
            
            count += prevCount;
            map.set(diff, (map.get(diff) || 0) + prevCount + 1);
        }
    }
    
   

 return count;
};
