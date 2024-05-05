/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        const index = nums.findIndex((num, idx) => num === complement && idx !== i);
        if (index !== -1) {
            return [i, index];
        }
    }
};