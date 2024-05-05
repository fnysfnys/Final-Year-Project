var splitArray = function(nums, k) {
    const n = nums.length;
    const memo = new Map();
    
    function dp(i, k) {
        if (k === 1) return sum(nums.slice(i));
        if (i === n) return 0;
        if (memo.has(`${i}-${k}`)) return memo.get(`${i}-${k}`);
        
        let result = Number.MAX_SAFE_INTEGER;
        let currentSum = 0;
        
        for (let j = i; j < n; j++) {
            currentSum += nums[j];
            result = Math.min(result, Math.max(currentSum, dp(j + 1, k - 1)));
        }
        
        memo.set(`${i}-${k}`, result);
        return result;
    }
    
    return dp(0, k);
};

function sum(arr) {
    return arr.reduce((acc, num) => acc + num, 0);
}
