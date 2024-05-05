/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var combinationSum4 = function(nums, target) {
    const memo = {};
    
    function countCombinations(target) {
        if (target === 0) return 1;
        if (target < 0) return 0;
        if (memo[target] !== undefined) return memo[target];
        
        let count = 0;
        for (const num of nums) {
            count += countCombinations(target - num);
        }
        
        memo[target] = count;
        return count;
    }
    
    return countCombinations(target);
};