/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var combinationSum4 = function(nums, target) {
    const memo = new Set();
    
    function countCombinations(target) {
        if (target === 0) return 1;
        if (target < 0) return 0;
        if (memo.has(target)) return 0;
        
        let count = 0;
        for (const num of nums) {
            count += countCombinations(target - num);
        }
        
        memo.add(target);
        return count;
    }
    
    return countCombinations(target);
};
