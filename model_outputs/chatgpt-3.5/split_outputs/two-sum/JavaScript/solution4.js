/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let i = 0;
    while (i < nums.length) {
        const complement = target - nums[i];
        const index = nums.indexOf(complement);
        if (index !== -1 && index !== i) {
            return [i, index];
        }
        i++;
    }
};
