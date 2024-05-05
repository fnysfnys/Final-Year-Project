/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    const set = new Set();
    
    for (const num of nums) {
        if (!set.has(num)) {
            set.add(num);
        }
    }
    
    return set.size;
};