var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    let count = 0;
    const dp = new Array(n).fill(0);
    
    for (let i = 0; i < n; i++) {
        const subsequenceMap = new Map();
        
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            const prevSubsequences = subsequenceMap.get(diff) || 0;
            
            dp[i] += (prevSubsequences + 1);
            count += prevSubsequences;
            subsequenceMap.set(diff, (subsequenceMap.get(diff) || 0) + 1);
        }
    }
    
    return count;
};