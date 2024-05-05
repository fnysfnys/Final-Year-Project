/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var combinationSum4 = function(nums, target) {
    if (target < 0) return 0;
    if (target === 0) return 1;
    
    let count = 0;
    for (const num of nums) {
        count += combinationSum4(nums, target - num);
    }
    
    return count;
};