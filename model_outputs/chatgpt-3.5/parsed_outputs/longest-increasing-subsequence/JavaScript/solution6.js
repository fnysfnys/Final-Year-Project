/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const map = new Map();
    
    function dp(i) {
        if (map.has(i)) return map.get(i);
        let maxLen = 1;
        for (let j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                maxLen = Math.max(maxLen, 1 + dp(j));
            }
        }
        map.set(i, maxLen);
        return maxLen;
    }
    
    let maxLength = 0;
    for (let i = 0; i < nums.length; i++) {
        maxLength = Math.max(maxLength, dp(i));
    }
    
    return maxLength;
};