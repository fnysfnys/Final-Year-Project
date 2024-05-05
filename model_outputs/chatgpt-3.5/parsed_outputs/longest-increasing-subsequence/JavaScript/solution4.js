/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const memo = {};
    
    function findLength(start, prev) {
        if (start === nums.length) return 0;
        const key = start + "_" + prev;
        if (memo[key]) return memo[key];
        
        let include = 0;
        if (nums[start] > prev) {
            include = 1 + findLength(start + 1, nums[start]);
        }
        
        const exclude = findLength(start + 1, prev);
        
        memo[key] = Math.max(include, exclude);
        return memo[key];
    }
    
    return findLength(0, -Infinity);
};